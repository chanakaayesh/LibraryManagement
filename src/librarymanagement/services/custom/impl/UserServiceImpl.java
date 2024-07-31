/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.services.custom.impl;

import java.util.Map;
import librarymanagement.alert.AlertMessage;
import librarymanagement.dao.DaoFactory;
import librarymanagement.dao.custome.MemberDao;
import librarymanagement.dao.custome.UserDao;
import librarymanagement.dto.UserDto;
import librarymanagement.entity.UserEntity;
import librarymanagement.enumContainer.EnumContainer;
import librarymanagement.services.custom.UserService;

/**
 *
 * @author ayesh
 */
public class UserServiceImpl implements UserService{
    private UserDao userDao = (UserDao)DaoFactory.getInstance().getDao(EnumContainer.DaoType.USER);
     private MemberDao memberDao = (MemberDao)DaoFactory.getInstance().getDao(EnumContainer.DaoType.MEMBER);

    @Override
    public String saveUser(UserDto dto) throws Exception {
    
                String mId=memberDao.getMaxmemberID();
                AlertMessage.getInstance().printMessage("User geting id"+mId);
                
              
                if(mId !=null){
                          dto.setMemberId(mId);               
                 
                                  
             return userDao.create(userEntity(dto))? EnumContainer.databaseDateStatus.SUCCESS.getValue():EnumContainer.databaseDateStatus.FAIL.getValue();
                }
        return null;
    }

    @Override
    public String updateUser(UserDto dto) throws Exception {
    
            return userDao.update(userEntity(dto))? EnumContainer.databaseDateStatus.SUCCESS.getValue():EnumContainer.databaseDateStatus.FAIL.getValue();
    }

    @Override
    public String deleteUser(String Id) throws Exception {
           return userDao.delete(Id)? EnumContainer.databaseDateStatus.SUCCESS.getValue():EnumContainer.databaseDateStatus.FAIL.getValue();
    }

    @Override
    public UserDto getUserById(String Id) throws Exception {
        AlertMessage.getInstance().printMessage("UserServiceImpl:getUserById getting Mid " + Id);
        UserEntity userEntity =userDao.get(Id);
        if(userEntity !=null){
            
             AlertMessage.getInstance().printMessage("UserServiceImpl:getUserById geting userDao 2 : "+userEntity);
                 return userEntityToDto(userEntity);
        
        }else{
            AlertMessage.getInstance().printMessage("UserServiceImpl:getUserById user null for mid "+Id);
            return null;
        }
        
       
       
        
        
    }
    
   @Override
    public Map<String, Object> userlogin(String email, String password) throws Exception {
    
         Map<String, Object> result = userDao.userlogin(email, password);
         UserDto user =userEntityToDto((UserEntity)result.get(EnumContainer.LoginStatus.LOGINUSER.getValue()));
      
         result.put(EnumContainer.LoginStatus.LOGINUSER.getValue(), user);
         
         return result;
    }
    
     private UserEntity userEntity(UserDto dto){
        
        return new UserEntity(dto.getMemberId(), dto.getEmail(), dto.getUserPassword(), dto.getUserType());
    }
     
    private UserDto userEntityToDto(UserEntity entity){
        AlertMessage.getInstance().printMessage("UserServiceImpl:UserDto userEntity 4 :"+entity);
        return new UserDto(entity.getMemberId(), entity.getEmail(), entity.getUserPassword(), entity.getUserType());
    }

  
}

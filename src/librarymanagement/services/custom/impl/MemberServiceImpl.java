/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.services.custom.impl;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import java.util.List;
import java.sql.Connection;
import java.util.ArrayList;
import librarymanagement.alert.AlertMessage;
import librarymanagement.dao.DaoFactory;
import librarymanagement.dao.custome.MemberDao;
import librarymanagement.dao.custome.UserDao;
import librarymanagement.db.DBConnection;
import librarymanagement.dto.MemberDto;
import librarymanagement.dto.UserDto;
import librarymanagement.entity.MemberEntity;
import librarymanagement.entity.UserEntity;
import librarymanagement.enumContainer.EnumContainer;
import librarymanagement.services.custom.MemberService;

/**
 *
 * @author ayesh
 */
public class MemberServiceImpl implements MemberService{
    
    private MemberDao memberDao = (MemberDao)DaoFactory.getInstance().getDao(EnumContainer.DaoType.MEMBER);
    // 

    @Override
    public String saveMember(MemberDto dto) throws Exception{
        
        boolean isMemberCreated =   memberDao.create(membeDtoToEntity(dto));
        
          Connection connection = DBConnection.getInstance().getConnection();
//        
//          try {
//              
//                connection.setAutoCommit(false);
//            
//              if(memberDao.create(membeDtoToEntity(dto))){
//                  String mId=memberDao.getMaxSerialNumber();
//                  dto.setMemberId(mId);
//                if(userDao.create(userEntity(dto.getUser()))){
//                      connection.commit();
//                    
//                    return EnumContainer.databaseDateStatus.SUCCESS.getValue();
//                }  else{
//                        connection.rollback();
//                        return "User save error";
//                    }
//                    
//              
//              }else{
//              connection.rollback();
//                return "Member save error";
//              }
//        } catch (Exception e) {
//            
//            connection.rollback();
//            AlertMessage.getInstance().printMessage("Erro is : "+e.getMessage());
//            throw e;
//        } finally {
//               connection.setAutoCommit(true);
//        }
//          
//          
      
      
//      
//          
//      }
    
     return isMemberCreated? EnumContainer.databaseDateStatus.SUCCESS.getValue():EnumContainer.databaseDateStatus.FAIL.getValue();
    }

    @Override
    public String updateMember(MemberDto dto) throws Exception{

        return memberDao.update(membeDtoToEntity(dto))? EnumContainer.databaseDateStatus.SUCCESS.getValue():EnumContainer.databaseDateStatus.FAIL.getValue();
   
    }

    @Override
    public String deleteMember(String Id) throws Exception{
        return memberDao.delete(Id)? EnumContainer.databaseDateStatus.SUCCESS.getValue():EnumContainer.databaseDateStatus.FAIL.getValue();
   }

    @Override
    public MemberDto getMemberById(String Id) throws Exception{
 
        return membeEntityToDto(memberDao.get(Id));
    }

    @Override
    public List<MemberDto> getMemberList() throws Exception{
               List<MemberDto> memberLis =new ArrayList<>();
               
               for(MemberEntity entity : memberDao.getAll()){
                   
                   memberLis.add(membeEntityToDto(entity));
               }
               
              return memberLis;
    }
    
    
    private MemberEntity membeDtoToEntity(MemberDto dto){
    
      return new MemberEntity(0, dto.getMemberId(), dto.getLastName(), dto.getFirstName(), dto.getAge(),
              dto.getAddress());
    }
    
    
    private MemberDto membeEntityToDto(MemberEntity entity){
    
      return new MemberDto(0, entity.getMemberId(), entity.getLastName(), entity.getFirstName(), entity.getAge(),
              entity.getAddress());
    }
    private UserEntity userEntity(UserDto dto){
        
        return new UserEntity(dto.getMemberId(), dto.getEmail(), dto.getUserPassword(), dto.getUserType());
    }
    
   
}

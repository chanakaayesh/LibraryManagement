/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.dao.custome.impl;

import com.mysql.cj.conf.ConnectionUrlParser;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import librarymanagement.alert.AlertMessage;

import librarymanagement.dao.CrudUtil;
import librarymanagement.dao.custome.UserDao;
import librarymanagement.entity.UserEntity;
import librarymanagement.enumContainer.EnumContainer;

/**
 *
 * @author ayesh
 */
public class UserDaoImpl implements UserDao{

    @Override
    public boolean create(UserEntity t) throws Exception {
   
        return CrudUtil.executeUpdate("INSERT INTO user VALUE(?,?,?,?)", t.getMemberId(),
                t.getEmail(),t.getUserPassword(),t.getUserType());
    }

    @Override
    public boolean update(UserEntity t) throws Exception {
    
     return CrudUtil.executeUpdate("UPDATE user SET userPassword=? WHERE memberId= ?",
                t.getUserPassword(), t.getMemberId());
    }

    @Override
    public boolean delete(Object id) throws Exception {
            return CrudUtil.executeUpdate("DELETE FROM user WHERE  memberId = ?", id);
    }

    @Override
    public UserEntity get(Object id) throws Exception {
        
        ResultSet rsl =CrudUtil.excuteQuery("SELECT* FROM user WHERE memberId= ? ", id);
    
     
        if (rsl != null && rsl.next()) {
        
            UserEntity userEntity = getUserEntity(rsl);
        AlertMessage.getInstance().printMessage("UserDaoImpl:UserEntity getting User1: " + userEntity);
             return userEntity;
            } else {
       AlertMessage.getInstance().printMessage("UserDaoImpl: No user found for id:1 " + id);
        return null; // No user found
        }
    }

    @Override
    public ArrayList<UserEntity> getAll() throws Exception {
        //this method can't call, because one member can has one logine/user, not a list of user
    return null;
    }

    @Override
    public Map<String,Object>  userlogin(String email, String password) throws Exception {
                 Map<String, Object> result = new HashMap<>();
    ResultSet rsl = CrudUtil.excuteQuery("SELECT * FROM user WHERE email = ? AND userPassword = ?", email, password);

    if (rsl != null && rsl.next()) {
        UserEntity entity = getUserEntity(rsl);
        boolean isLoginSuccess = false;

        // Log retrieved entity details
        AlertMessage.getInstance().printMessage("UserDaoImpl:userlogin: Retrieved entity: " + entity);

        if (email.equals(entity.getEmail()) && password.equals(entity.getUserPassword())) {
            isLoginSuccess = true;
            AlertMessage.getInstance().printMessage("UserDaoImpl:userlogin : Login success for email: " + email);
        } else {
            AlertMessage.getInstance().printMessage("UserDaoImpl:userlogin : Incorrect credentials for email: " + email);
        }

        entity.setUserPassword("******");
        result.put(EnumContainer.LoginStatus.LOGINSTATUS.getValue(), isLoginSuccess);
        result.put(EnumContainer.LoginStatus.LOGINUSER.getValue(), entity);
    } else {
        result.put(EnumContainer.LoginStatus.LOGINSTATUS.getValue(), false);
        result.put(EnumContainer.LoginStatus.LOGINUSER.getValue(), null);
        AlertMessage.getInstance().printMessage("UserDaoImpl:userlogin : No user found for email: " + email);
    }

    return result;
       
    
    }

    private UserEntity getUserEntity(ResultSet rsl) throws Exception{
   
            UserEntity entity = new UserEntity(rsl.getString("memberId"),
                    rsl.getString("email"), rsl.getString("userPassword"), rsl.getString("userType"));
            
            return entity;
       
    
      
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.dao.custome.impl;

import java.sql.ResultSet;
import java.util.ArrayList;

import librarymanagement.dao.CrudUtil;
import librarymanagement.dao.custome.UserDao;
import librarymanagement.entity.UserEntity;

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
        
        ResultSet rsl =CrudUtil.excuteQuery("SELECT memberId,email,userType FROM user WHERE memberId= ? ", id);
    
        if(rsl.next()){
            UserEntity entity = new UserEntity(rsl.getString("memberId"),
                    rsl.getString("email"), "*******", rsl.getString("userType"));
            
            return entity;
        }
        
        return null;
    }

    @Override
    public ArrayList<UserEntity> getAll() throws Exception {
        //this method can't call, because one member can has one logine/user, not a list of user
    return null;
    }
    
}

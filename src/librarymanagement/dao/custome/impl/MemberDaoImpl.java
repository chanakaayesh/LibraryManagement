/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.dao.custome.impl;

import java.util.ArrayList;
import librarymanagement.dao.CrudUtil;
import librarymanagement.dao.custome.MemberDao;
import librarymanagement.entity.MemberEntity;
import java.sql.ResultSet;

/**
 *
 * @author ayesh
 */
public class MemberDaoImpl implements MemberDao{

    @Override
    public boolean create(MemberEntity t) throws Exception {
        
        t.setMemberId(getMaxSerialNumber());
       
        return CrudUtil.executeUpdate("INSERT INTO member VALUE(DEFAULT,?,?,?,?,?)", t.getMemberId(),
                t.getLastName(),t.getFirstName(),t.getAge(),t.getAddress()
                );
    }

    @Override
    public boolean update(MemberEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public MemberEntity get(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<MemberEntity> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private String getMaxSerialNumber()throws Exception{
    
        Integer maxId=0;
        ResultSet result =CrudUtil.excuteQuery("SELECT MAX(serialNumber) AS lastSerialNumber FROM member;" );
        
        if(result.next()){
            maxId   =result.getInt("lastSerialNumber");
        }
        System.out.println("getting "+result.wasNull());
        return  result.wasNull()? "M"+1:"M"+(maxId+1);
    }
    
}

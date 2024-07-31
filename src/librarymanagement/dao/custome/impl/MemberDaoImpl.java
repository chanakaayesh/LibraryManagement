/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.dao.custome.impl;

import java.sql.ResultSet;
import java.util.ArrayList;

import librarymanagement.alert.AlertMessage;
import librarymanagement.dao.CrudUtil;
import librarymanagement.dao.custome.MemberDao;
import librarymanagement.entity.MemberEntity;

/**
 *
 * @author ayesh
 */
public class MemberDaoImpl implements MemberDao{

    @Override
    public boolean create(MemberEntity t) throws Exception {
        
        t.setMemberId(generateNewMemId());
       
        return CrudUtil.executeUpdate("INSERT INTO member VALUE(DEFAULT,?,?,?,?,?)", t.getMemberId(),
                t.getLastName(),t.getFirstName(),t.getAge(),t.getAddress()
                );
    }

    @Override
    public boolean update(MemberEntity t) throws Exception {
           return CrudUtil.executeUpdate("UPDATE member SET  lastName = ? , firstName= ?, age= ?, address = ?  WHERE memberId = ?", 
                     t.getLastName(),t.getFirstName(),t.getAge(),t.getAddress(),t.getMemberId()
                     );
    }

    @Override
    public boolean delete(String id) throws Exception {
    
        return CrudUtil.executeUpdate("DELETE FROM member WHERE memberId = ?", id);
    }

    @Override
    public MemberEntity get(String id) throws Exception {
        
        ResultSet rsl = CrudUtil.excuteQuery("SELECT* FROM member WHERE  memberId = ? ", id);
        if(rsl !=null&& rsl.next()){
            return getEntity(rsl);
        }else{
        return null;
        }
      
        
        
    }

    @Override
    public ArrayList<MemberEntity> getAll() throws Exception {
        
        ArrayList<MemberEntity> entityList = new ArrayList<>();
        ResultSet rsl = CrudUtil.excuteQuery("SELECT* FROM member ORDER BY serialNumber");
        
        if (rsl != null) {
             while (rsl.next()) {
            MemberEntity entity = getEntity(rsl); // Call getEntity once per row
         //   AlertMessage.getInstance().printMessage("MemberDaoImpl:getMemberList member " + entity);
            if (entity != null) {
                entityList.add(entity); // Add the entity to the list if it's not null
                }
            }
         }
    return entityList;
    }
    
    /**
     *
     * @return
     * @throws Exception
     */
    
    private String generateNewMemId()throws Exception{
     int maxId=0;
        ResultSet result =CrudUtil.excuteQuery("SELECT MAX(serialNumber) AS lastSerialNumber FROM member;" );
        
        if(result !=null && result.next()){
            maxId   =result.getInt("lastSerialNumber");
        }
        
       //  AlertMessage.getInstance().printMessage("Mem geting mx id : "+(maxId ==0? "M"+1:"M"+(maxId)));
 
        return  maxId ==0? "M1":"M"+(maxId+1);
    }
    @Override
    public String getMaxmemberID()throws Exception{
    
            int maxId = 0;
    ResultSet result = CrudUtil.excuteQuery("SELECT MAX(serialNumber) AS lastSerialNumber FROM member;");
    
    if (result.next()) {
        maxId = result.getInt("lastSerialNumber");
    }
    
    String maxMId = "";
    if (maxId != 0) {
        ResultSet result1 = CrudUtil.excuteQuery("SELECT memberId FROM member WHERE serialNumber = ?", maxId);
        
        if (result1.next()) {
            maxMId = result1.getString("memberId");
        }
    }
    
    //AlertMessage.getInstance().printMessage("Member getting value id: " + maxMId);
   // AlertMessage.getInstance().printMessage("Member getting max id: " + (maxMId.equals("") ? "M1" : maxMId));
    
    return maxMId.equals("") ? "M1" : maxMId;
    }
    
    
    
    private MemberEntity getEntity(ResultSet rsl)throws Exception{
    
                
             
                    MemberEntity entity = new MemberEntity(rsl.getInt("serialNumber"), rsl.getString("memberId"), 
                    rsl.getString("lastName"), rsl.getString("firstName"), rsl.getInt("age"),
                    rsl.getString("address"));
            
                     return entity;
           
           
    }
    
}
















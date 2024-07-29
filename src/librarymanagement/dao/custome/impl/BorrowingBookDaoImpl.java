/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.dao.custome.impl;

import java.util.ArrayList;
import java.sql.ResultSet;
import librarymanagement.alert.AlertMessage;
import librarymanagement.dao.CommonDbfunctions;
import librarymanagement.dao.CrudUtil;
import librarymanagement.dao.custome.BorrowingBookDao;
import librarymanagement.entity.BorrowingBookEntity;

/**
 *
 * @author ayesh
 */
public class BorrowingBookDaoImpl implements BorrowingBookDao{

    @Override
    public boolean create(BorrowingBookEntity t) throws Exception {
           t.setBorrowId(
          CommonDbfunctions.getInstance().generateNewStringID("SELECT MAX(serialNumber) AS lastSerialNumber FROM borrowingBook;","BW"));
        
             return CrudUtil.executeUpdate("INSERT INTO borrowingBook VALUE(DEFAULT,?,?,?)", t.getBorrowId(),
                t.getMemberId(),t.getBorrowingDate()
                );

    }


    @Override
    public boolean update(BorrowingBookEntity t) throws Exception {
    
            
         return CrudUtil.executeUpdate("UPDATE borrowingBook SET memberId= ?, borrowingDate = ?  WHERE borrowId = ?", 
                     t.getMemberId(),t.getBorrowingDate(),t.getBorrowingDate()
                     );
    }

    @Override
    public boolean delete(String id) throws Exception {
    
      return  CrudUtil.executeUpdate("DELETE FROM borrowingBook WHERE borrowId = ?", id);
    }

    @Override
    public BorrowingBookEntity get(String id) throws Exception {
        
        ResultSet rsl = CrudUtil.excuteQuery("SELECT* FROM borrowingBook WHERE borrowId = ?", id);
        
        
        return getEntity(rsl);
    }

    @Override
    public ArrayList<BorrowingBookEntity> getAll() throws Exception {
            ArrayList<BorrowingBookEntity> entityList = new ArrayList<>();
            
            ResultSet rsl = CrudUtil.excuteQuery("SELECT* FROM borrowingBook");
            while(rsl.next()){
                  entityList.add(getEntity(rsl));
            }
    
            return entityList;
    }

    private BorrowingBookEntity getEntity(ResultSet rsl)throws Exception {
            if(rsl.next()){
            BorrowingBookEntity entity = new BorrowingBookEntity(rsl.getInt("serialNumber"), 
                    rsl.getString("borrowId"), rsl.getString("memberId"), rsl.getDate("borrowingDate"));
        }
    
            return null;
    }

    @Override
    public String getMaxmemberID() throws Exception {
   
     int maxId=0;
        ResultSet result =CrudUtil.excuteQuery("SELECT MAX(serialNumber) AS lastSerialNumber FROM borrowingBook;" );
        
        if(result.next()){
            maxId   =result.getInt("lastSerialNumber");
        }
       
         AlertMessage.getInstance().printMessage("User geting mx id"+(maxId ==0? "BW"+1:"BW"+(maxId)));
        return  maxId ==0? "BW"+1:"BW"+(maxId);
    }
    
}

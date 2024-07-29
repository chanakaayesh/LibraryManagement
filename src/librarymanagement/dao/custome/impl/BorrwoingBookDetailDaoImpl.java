/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.dao.custome.impl;

import java.util.ArrayList;
import java.sql.ResultSet;
import librarymanagement.dao.CommonDbfunctions;
import librarymanagement.dao.CrudUtil;
import librarymanagement.dao.custome.BorrwoingBookDetailDao;
import librarymanagement.entity.BorrowinDetailsEntity;
import librarymanagement.entity.BorrowingBookEntity;

/**
 *
 * @author ayesh
 */

public class BorrwoingBookDetailDaoImpl implements BorrwoingBookDetailDao{

    @Override
    public boolean create(BorrowinDetailsEntity t) throws Exception {
    
        
             return CrudUtil.executeUpdate("INSERT INTO borrowinDetails VALUE(?,?,?,?,?,?)", t.getBorrowId(),
                t.getDueDate(),t.getReturnedDate(),t.getFine(),t.getBookId()
                );}

    @Override
    public boolean update(BorrowinDetailsEntity t) throws Exception {

           return CrudUtil.executeUpdate("UPDATE borrowinDetails SET   dueDate= ?, returnedDate= ?, fine = ?, bookId = ? WHERE id = ?", 
                     t.getDueDate(),t.getReturnedDate(),t.getFine(),t.getBookId(),t.getId()
                     );
    }

    @Override
    public boolean delete(Object id) throws Exception {
    
                return CrudUtil.executeUpdate("DELETE FROM borrowinDetails WHERE id=?", id);
    }

     @Override
    public boolean deletBorrowDetail(String bookId, String borrowId) throws Exception {
        
          return CrudUtil.executeUpdate("DELETE FROM borrowinDetails WHERE bookId = ? AND borrowId = ?", bookId,borrowId);
    }
    
    
    @Override
    public BorrowinDetailsEntity get(Object id) throws Exception {
            
        ResultSet rsl = CrudUtil.excuteQuery("SELECT* FROM borrowinDetails WHERE  borrowId = ? ", id);
        return getEntity(rsl);
    
    }

    @Override
    public ArrayList<BorrowinDetailsEntity> getAll() throws Exception {
        ArrayList<BorrowinDetailsEntity> entityList = new ArrayList<>();
     ResultSet rsl = CrudUtil.excuteQuery("SELECT* FROM borrowinDetails WHERE ");
     while(rsl.next()){
         entityList.add(getEntity(rsl));
     }
     
     return entityList;
    }

    private BorrowinDetailsEntity getEntity(ResultSet rsl) throws Exception{
            if(rsl.next()){
            BorrowinDetailsEntity entity = new BorrowinDetailsEntity(rsl.getInt("id"),rsl.getString("borrowId"),
                    rsl.getDate("dueDate"), rsl.getDate("returnedDate"), rsl.getDouble("fine"), rsl.getString("bookId"));
        
                    return entity;
        }
            return null;
    }

   
}

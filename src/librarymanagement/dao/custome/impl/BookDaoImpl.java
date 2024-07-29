/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.dao.custome.impl;

import java.util.ArrayList;
import librarymanagement.dao.CrudUtil;
import librarymanagement.dao.custome.BookDao;
import librarymanagement.entity.BookEntity;
import java.sql.ResultSet;
import librarymanagement.alert.AlertMessage;
import librarymanagement.dao.CommonDbfunctions;

/**
 *
 * @author ayesh
 */
public class BookDaoImpl implements BookDao{

    @Override
    public boolean create(BookEntity t) throws Exception {
        t.setBookId(
          CommonDbfunctions.getInstance().generateNewStringID("SELECT MAX(serialNumber) AS lastSerialNumber FROM book;","B"));
        
   return CrudUtil.executeUpdate("INSERT INTO book VALUE(DEFAULT,?,?,?,?,?)", t.getBookId(),
                t.getCategoryId(),t.getAuthor(),t.getBookTitle(),t.getPublishDate()
                ); }

    @Override
    public boolean update(BookEntity t) throws Exception {
   
         return CrudUtil.executeUpdate("UPDATE book SET  categoryId = ? , author= ?, bookTitle= ?, publishDate = ?  WHERE bookId = ?", 
                     t.getCategoryId(),t.getAuthor(),t.getBookId(),t.getPublishDate(),t.getBookId()
                     );
    }

    @Override
    public boolean delete(String id) throws Exception {
   
           return CrudUtil.executeUpdate("DELETE FROM book WHERE bookId = ?", id);
    }

    @Override
    public BookEntity get(String id) throws Exception {
   
    ResultSet rsl = CrudUtil.excuteQuery("SELECT* FROM book WHERE  memberId = ? ", id);
    
        return bookResultSetToEntity(rsl);
        
    }
    
    

    @Override
    public ArrayList<BookEntity> getAll() throws Exception {
     
         ArrayList<BookEntity> entityList = new ArrayList<>();
        ResultSet rsl = CrudUtil.excuteQuery("SELECT* FROM book");
        
        while(rsl.next()){
        
           entityList.add(bookResultSetToEntity(rsl));
        }
        
        return entityList;
    
    }
    
  
    
    private BookEntity bookResultSetToEntity(ResultSet rsl) throws Exception{
    
        if(rsl.next()){
               BookEntity entity = new BookEntity(rsl.getInt("serialNumber"),
                       rsl.getString("bookId"), rsl.getString("categoryId"), rsl.getString("author"),
                       rsl.getString("bookTitle"), rsl.getDate("publishDate"), rsl.getInt("itemQuantity"));
               
               return entity;
            }
        
        return null;
    }
}

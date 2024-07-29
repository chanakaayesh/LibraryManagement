/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.dao.custome.impl;

import java.util.ArrayList;
import librarymanagement.dao.CommonDbfunctions;
import librarymanagement.dao.CrudUtil;
import librarymanagement.dao.custome.BookCategoryDao;
import librarymanagement.entity.BookCategoryEntity;
import java.sql.ResultSet;


/**
 *
 * @author ayesh
 */
public class BookCategoryDaoImpl implements BookCategoryDao{
      
    @Override
    public boolean create(BookCategoryEntity t) throws Exception {
   
             t.setCategoryId(
              CommonDbfunctions.getInstance().generateNewStringID("SELECT MAX(serialNumber) AS lastSerialNumber FROM bookCategories;","C")
             );
       
        return CrudUtil.executeUpdate("INSERT INTO bookCategories VALUE(DEFAULT,?,?)", t.getCategoryId(),
                t.getCategoryName()
                );
    }

    @Override
    public boolean update(BookCategoryEntity t) throws Exception {
   
              return CrudUtil.executeUpdate("UPDATE bookCategories SET  categoryName = ?  WHERE categoryId = ?", 
                     t.getCategoryName(),t.getCategoryId()
                     );
    }

    @Override
    public boolean delete(String id) throws Exception {
         return CrudUtil.executeUpdate("DELETE FROM bookCategories WHERE categoryId = ?", id);
    
    }

    @Override
    public BookCategoryEntity get(String id) throws Exception {
      ResultSet rsl = CrudUtil.excuteQuery("SELECT* FROM bookCategories WHERE  categoryId = ? ", id);
      
      return getEntity(rsl);
        
        
    }

    @Override
    public ArrayList<BookCategoryEntity> getAll() throws Exception {
         ArrayList<BookCategoryEntity> categoryList = new ArrayList<>();
         ResultSet rsl = CrudUtil.excuteQuery("SELECT* FROM bookCategories  ");
         
         while(rsl.next()){
             categoryList.add(getEntity(rsl));
         }
          return categoryList;
    }
    
    
    private BookCategoryEntity getEntity(ResultSet rsl) throws Exception{
    
          if(rsl.next()){
      
            BookCategoryEntity entity = new BookCategoryEntity(rsl.getInt("serialNumber"), rsl.getString("categoryId"), rsl.getString("categoryName"));
              
          return entity;
          }
        return null;
    }
    
    
    
}

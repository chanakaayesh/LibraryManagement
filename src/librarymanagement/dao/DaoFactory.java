/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.dao;

import librarymanagement.dao.custome.impl.BookCategoryDaoImpl;
import librarymanagement.dao.custome.impl.BookDaoImpl;
import librarymanagement.dao.custome.impl.BorrowingBookDaoImpl;
import librarymanagement.dao.custome.impl.BorrwoingBookDetailDaoImpl;
import librarymanagement.dao.custome.impl.MemberDaoImpl;
import librarymanagement.dao.custome.impl.UserDaoImpl;
import librarymanagement.enumContainer.EnumContainer;

/**
 *
 * @author ayesh
 */
public class DaoFactory {
    
      private static DaoFactory instance;
    private DaoFactory() {}
    
    public static DaoFactory getInstance(){
    
        return instance == null? instance =new DaoFactory(): instance;
       
    }
    
    
    
    public SuperDao getDao(EnumContainer.DaoType type){
        switch (type) {
            case MEMBER:
                
                    return new MemberDaoImpl();
               
             case USER:
                
                    return new UserDaoImpl();
               
               case BOOK:
                
                    return new BookDaoImpl();
               
               case  BOOKCATEGORY:
                
                    return new BookCategoryDaoImpl();
               
               
               case  BORROWINGBOOK:
               
                    return new BorrowingBookDaoImpl();
               
               case BORROWINGDETAIL:
                   
                    return new BorrwoingBookDetailDaoImpl();
      
            default:
                return null;
        }
        
    } 
    
    
}

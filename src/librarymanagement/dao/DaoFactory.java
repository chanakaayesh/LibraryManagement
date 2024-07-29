/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.dao;

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
                
               return null;
               
               case  BOOKCATEGORY:
                
               return null;
               
               
               case  BORROWINGBOOK:
               
               return null;
      
            default:
                return null;
        }
        
    } 
    
    
}

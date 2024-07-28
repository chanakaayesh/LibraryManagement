/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.dao;

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
            case ITEM:
                
               return null;
               
             case CUSTOMER:
                
               return null;
               
               case ORDER:
                
               return null;
               
               case ORDER_DETAILS:
                
               return null;
      
            default:
                return null;
        }
        
    } 
    
    
}

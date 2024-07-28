/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.services;

import librarymanagement.enumContainer.EnumContainer.ServiceType;
import static librarymanagement.enumContainer.EnumContainer.ServiceType.BOOK;
import static librarymanagement.enumContainer.EnumContainer.ServiceType.USER;
import librarymanagement.services.custom.impl.MemberServiceImpl;

/**
 *
 * @author ayesh
 */
    public class Servicefactor {
    
        
    private static Servicefactor instance;

    private Servicefactor() {}
    
    public static Servicefactor getInstance(){
    
        return instance ==null? (instance = new Servicefactor()): instance;
    }
    
    public SuperService getService(ServiceType serviceType){
    
        switch (serviceType) {
            case MEMBER:
                return new MemberServiceImpl();
            
            case USER:
                    return null;
            case BOOK:
                    return null;
                    
            case BOOKCATEGORY:
                    return null;
            case BORROWINGBOOK:
                    return null;
               
            default:
                return null;
        }
    }
    
}

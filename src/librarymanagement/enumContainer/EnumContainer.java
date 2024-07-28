/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.enumContainer;

/**
 *
 * @author ayesh
 */
public class EnumContainer {
    
    private static EnumContainer instance;
    
    private EnumContainer(){}
    
    public static EnumContainer getIntance(){
    
            return instance ==null? instance = new EnumContainer(): instance;
    }
    
    
    public enum DaoType{
        
        MEMBER,USER,BOOKCATEGORY,BOOK,BORROWINGBOOK;
    }
    
    public enum ServiceType{
     MEMBER,USER,BOOKCATEGORY,BOOK,BORROWINGBOOK;
    }
    
    public enum databaseDateStatus{
        SUCCESS("SUCCES"),
        FAIL("FAIL");
        
        private String value;
        
        private databaseDateStatus (String value){
            this.value =value;
        }
        
        public String getValue(){
            return value;
        }
        
    }
}

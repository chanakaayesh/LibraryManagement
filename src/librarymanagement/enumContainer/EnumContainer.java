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
        
        MEMBER,USER,BOOKCATEGORY,BOOK,BORROWINGBOOK,BORROWINGDETAIL;
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
    
    public enum LoginStatus{
        LOGINSTATUS("LOGINSTATUS"),
        LOGINUSER("USER");
        
        private String value;
        
        private LoginStatus (String value){
            this.value =value;
        }
        
        public String getValue(){
            return value;
        }
    
    }
    
    public enum UserType{
        
        MEMEBER("MEMBER"),
        STUFF("STUFF");
        
        private String value;

        private UserType(String value) {
            this.value = value;
        }
        
        
        public String getValue(){
            return value;
        }
    }
    
    public enum RegistrationPanel{
        SHOW("SHOW"),
        HIDE("HIDE");
        
        private String value;

        private RegistrationPanel(String value) {
            this.value = value;
        }
        
        public String getValue(){
            return value;
        }
    }
    
    public enum CrudOperationType{
        SAVE,UPDATE,DELETE;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librarymanagement;

import java.util.logging.Level;
import java.util.logging.Logger;
import librarymanagement.alert.AlertMessage;
import librarymanagement.contoller.MemberController;
import librarymanagement.contoller.UserController;
import librarymanagement.dto.MemberDto;
import librarymanagement.dto.UserDto;
import librarymanagement.enumContainer.EnumContainer;
import librarymanagement.view.HomePage;
import librarymanagement.view.LoginView;


/**
 *
 * @author ayesh
 */
public class LibraryManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            // saveMember();
        
            //  updateMemberAndPassword();
            deleteMemberAndUser();
               // viewMemerUser();
              //  searchByIdmemerAndUser();
        
     //  new LoginView().setVisible(true);
    UserDto user = new UserDto("M20", "", "89755", "");
         
    new HomePage(user).setVisible(true);
   /*     try {
            AlertMessage.getInstance().printMessage("getUserBy id "+UserController.getInstance().getUser("M16")); 
        } catch (Exception e) {
             AlertMessage.getInstance().printMessage("error at main "+e.getMessage());
        }*/
     
    }
    
    
    private static void  viewMemerUser() {
    
        try {
            for(MemberDto dto :MemberController.getInstance().getMemberList()){
                
                AlertMessage.getInstance().printMessage("Memer lis is : "+dto);
            }
        } catch (Exception ex) {
            AlertMessage.getInstance().printMessage("err is "+ex.getMessage());
           
        }
        
    }
    
    
    private static void searchByIdmemerAndUser(){
        try {
            
            AlertMessage.getInstance().printMessage("getmberBy id "+MemberController.getInstance().getMemberByID("M16"));
           AlertMessage.getInstance().printMessage("getUserBy id "+UserController.getInstance().getUser("M16"));    
        } catch (Exception ex) {
             AlertMessage.getInstance().printMessage("err is "+ex.getMessage());
        }
        
    }
    
    
        private static void  deleteMemberAndUser(){

            try {
                  
                    
                    
                    if(UserController.getInstance().delateUser("M29").equals(EnumContainer.databaseDateStatus.SUCCESS.getValue())){
                        MemberController.getInstance().delateMember("M29");
                    
                    }
                    
                    

                } catch (Exception e) {
                System.out.println("Value is a erro : "+e.getMessage());   

                }
    }
    
    private static void  updateMemberAndPassword(){

            try {
                    UserDto user = new UserDto("M20", "", "89755", "");
                    System.out.println("user Value is "); 
                    MemberDto dto = new MemberDto(0, "M20", "Max1", "ro1", 15, "Polonnaruwa");
                    
                    if(MemberController.getInstance().updateMember(dto).equals(EnumContainer.databaseDateStatus.SUCCESS.getValue())){
                        
                        UserController.getInstance().updateUser(user);
                    }

                } catch (Exception e) {
                System.out.println("Value is a erro : "+e.getMessage());   

                }
    }
    
    private static void saveMember(){
  
    }
    
}

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
         
               // viewMemerUser();
              //  searchByIdmemerAndUser();
        
    // new LoginView().setVisible(true);
   UserDto user = new UserDto("M9", "", "123", "");
         
  new HomePage(user).setVisible(true);
   /*     try {
            AlertMessage.getInstance().printMessage("getUserBy id "+UserController.getInstance().getUser("M16")); 
        } catch (Exception e) {
             AlertMessage.getInstance().printMessage("error at main "+e.getMessage());
        }*/
     
    }
    

    

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librarymanagement;

import librarymanagement.contoller.MemberController;
import librarymanagement.dto.MemberDto;
import librarymanagement.dto.UserDto;

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
        
        UserDto user = new UserDto("M1", "ayesh", "123", "Memebr");
        
        MemberDto dto = new MemberDto(0, "0", "ruwan", "Arun", 15, "colombo",  user);
        
              
        
        
        try {
            MemberController controller1 = new MemberController();
        System.out.println("Value is "+controller1.save(dto));   
        } catch (Exception e) {
              System.out.println("Value is a erro : "+e.getMessage());   
            
        }
    }
    
}

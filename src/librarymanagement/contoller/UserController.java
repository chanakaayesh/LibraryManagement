/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.contoller;

import librarymanagement.dto.UserDto;
import librarymanagement.enumContainer.EnumContainer;
import librarymanagement.services.Servicefactor;
import librarymanagement.services.custom.UserService;

/**
 *
 * @author ayesh
 */
public class UserController {
    private UserService servie =  (UserService) Servicefactor.getInstance().getService(EnumContainer.ServiceType.USER);
    
    private static UserController instance;

    private UserController() {}
    
    public static UserController getInstance(){
        return instance ==null? instance=new UserController(): instance;
    }
    
    public String SaveUser(UserDto dto)throws Exception{
        
        return servie.saveUser(dto);
    }

    public String updateUser(UserDto dto) throws Exception{

        return servie.updateUser(dto);
    }
    
    public String delateUser(String memId) throws Exception{
        return servie.deleteUser(memId);
    }
    
    public UserDto getUser(String memId)throws Exception{
    
        return servie.getUserById(memId);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package librarymanagement.services.custom;

import java.util.Map;
import librarymanagement.dto.UserDto;
import librarymanagement.services.SuperService;

/**
 *
 * @author ayesh
 */
public interface UserService extends SuperService{
    
 public   String saveUser(UserDto dto)throws Exception;
 public   String updateUser(UserDto dto)throws Exception;
 public   String deleteUser(String Id)throws Exception;
 public  UserDto getUserById(String Id)throws Exception;
 public  Map<String,Object> userlogin(String email,String password) throws Exception;
    
}

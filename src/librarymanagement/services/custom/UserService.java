/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package librarymanagement.services.custom;

import librarymanagement.dto.UserDto;
import librarymanagement.services.SuperService;

/**
 *
 * @author ayesh
 */
public interface UserService extends SuperService{
    
    String saveUser(UserDto dto)throws Exception;
    String updateUser(UserDto dto)throws Exception;
    String deleteUser(String Id)throws Exception;
    UserDto getUserById(String Id)throws Exception;
    
}

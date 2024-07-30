/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package librarymanagement.dao.custome;


import java.util.Map;
import librarymanagement.dao.CrudDao;
import librarymanagement.entity.UserEntity;
import librarymanagement.enumContainer.EnumContainer;

/**
 *
 * @author ayesh
 */
public interface UserDao extends CrudDao<UserEntity, Object>  {
    //first key is check login and user
    //second key check logi stuatus and user value
     Map<String,Object> userlogin(String email,String password) throws Exception;
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.dto;

import librarymanagement.entity.*;

/**
 *
 * @author ayesh
 */
public class UserDto {
    
    private String memberId ;
    private String email ;
    private String userPassword ;
    private String userType ;

    public UserDto(String memberId, String email, String userPassword, String userType) {
        this.memberId = memberId;
        this.email = email;
        this.userPassword = userPassword;
        this.userType = userType;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "User{" + "memberId=" + memberId + ", email=" + email + ", userPassword=" + userPassword + ", userType=" + userType + '}';
    }
    
    
    
}

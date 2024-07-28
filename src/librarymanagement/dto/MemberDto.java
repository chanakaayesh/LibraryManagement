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
public class MemberDto {
    
   private int serialNumber ;
   private String memberId ;
   private String  lastName ;
   private String firstName ;
   private int age;
   private String address ;

   private UserDto user;

    public MemberDto(int serialNumber, String memberId, String lastName, String firstName, int age, String address, UserDto user) {
        this.serialNumber = serialNumber;
        this.memberId = memberId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.address = address;
       
        this.user = user;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

  

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "MemberDto{" + "serialNumber=" + serialNumber + ", memberId=" + memberId + ", lastName=" + lastName + ", firstName=" + firstName + ", age=" + age + ", address=" + address + ", user=" + user + '}';
    }

   
    
   
   
    
}

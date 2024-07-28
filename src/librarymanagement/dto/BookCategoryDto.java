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
public class BookCategoryDto {
    
   private int serialNumber ;
   private String categoryId ;
   private String  categoryName ;

    public BookCategoryDto(int serialNumber, String categoryId, String categoryName) {
        this.serialNumber = serialNumber;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "BookCategory{" + "serialNumber=" + serialNumber + ", categoryId=" + categoryId + ", categoryName=" + categoryName + '}';
    }
   
   
    
}

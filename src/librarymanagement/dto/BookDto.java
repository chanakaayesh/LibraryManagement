/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.dto;

import librarymanagement.entity.*;
import java.util.Date;

/**
 *
 * @author ayesh
 */
public class BookDto {
    
  private int  serialNumber ;
  private String  bookId ;
  private String  categoryId ;
  private String  author ;
  private String  bookTitle ;
  private Date  publishDate ;
  private int bookQuantity;

    public BookDto(int serialNumber, String bookId, String categoryId, String author, String bookTitle, Date publishDate, int itemQuantity) {
        this.serialNumber = serialNumber;
        this.bookId = bookId;
        this.categoryId = categoryId;
        this.author = author;
        this.bookTitle = bookTitle;
        this.publishDate = publishDate;
        this.bookQuantity = itemQuantity;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public int getItemQuantity() {
        return bookQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.bookQuantity = itemQuantity;
    }

    @Override
    public String toString() {
        return "BookEntity{" + "serialNumber=" + serialNumber + ", bookId=" + bookId + ", categoryId=" + categoryId + ", author=" + author + ", bookTitle=" + bookTitle + ", publishDate=" + publishDate + ", itemQuantity=" + bookQuantity + '}';
    }


  
  
}

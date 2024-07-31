/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.entity;

import java.util.Date;

/**
 *
 * @author ayesh
 */
public class BookEntity {
    
  private int  serialNumber ;
  private String  bookId ;
  private String  categoryName ;
  private String  author ;
  private String  bookTitle ;
  private Date  publishDate ;
  private int itemQuantity;

    public BookEntity(int serialNumber, String bookId, String categoryId, String author, String bookTitle, Date publishDate, int itemQuantity) {
        this.serialNumber = serialNumber;
        this.bookId = bookId;
        this.categoryName = categoryId;
        this.author = author;
        this.bookTitle = bookTitle;
        this.publishDate = publishDate;
        this.itemQuantity = itemQuantity;
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
        return categoryName;
    }

    public void setCategoryId(String categoryId) {
        this.categoryName = categoryId;
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
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    @Override
    public String toString() {
        return "BookEntity{" + "serialNumber=" + serialNumber + ", bookId=" + bookId + ", categoryId=" + categoryName + ", author=" + author + ", bookTitle=" + bookTitle + ", publishDate=" + publishDate + ", itemQuantity=" + itemQuantity + '}';
    }


  
  
}

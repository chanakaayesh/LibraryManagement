/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.dto;

import librarymanagement.entity.*;
import librarymanagement.dto.*;
import java.util.Date;

/**
 *
 * @author ayesh
 */
public class BorrowinDetailsDto {
    
    private int id;
    private String borrowId ;
    private Date dueDate ;
    private Date returnedDate ;
    private double fine ;
    private String bookId;

    public BorrowinDetailsDto(int id, String borrowId, Date dueDate, Date returnedDate, double fine, String bookId) {
        this.id = id;
        this.borrowId = borrowId;
        this.dueDate = dueDate;
        this.returnedDate = returnedDate;
        this.fine = fine;
        this.bookId = bookId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(String borrowId) {
        this.borrowId = borrowId;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getReturnedDate() {
        return returnedDate;
    }

    public void setReturnedDate(Date returnedDate) {
        this.returnedDate = returnedDate;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return "BorrowinDetailsEntity{" + "id=" + id + ", borrowId=" + borrowId + ", dueDate=" + dueDate + ", returnedDate=" + returnedDate + ", fine=" + fine + ", bookId=" + bookId + '}';
    }

    
  
    
}

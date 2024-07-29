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
public class BorrowingBookEntity {
    private int serialNumber ;
    private String borrowId ;
    private String memberId ;
    private Date borrowingDate ;

    public BorrowingBookEntity(int serialNumber, String borrowId, String memberId, Date borrowingDate) {
        this.serialNumber = serialNumber;
        this.borrowId = borrowId;
        this.memberId = memberId;
        this.borrowingDate = borrowingDate;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(String borrowId) {
        this.borrowId = borrowId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public Date getBorrowingDate() {
        return borrowingDate;
    }

    public void setBorrowingDate(Date borrowingDate) {
        this.borrowingDate = borrowingDate;
    }

    @Override
    public String toString() {
        return "BorrowingBookEntity{" + "serialNumber=" + serialNumber + ", borrowId=" + borrowId + ", memberId=" + memberId + ", borrowingDate=" + borrowingDate + '}';
    }
 
    
}

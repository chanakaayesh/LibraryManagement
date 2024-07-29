/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.dto;

import librarymanagement.entity.*;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ayesh
 */
public class BorrowingBookDto {
    private int serialNumber ;
    private String borrowId ;
    private String memberId ;
    private Date borrowingDate ;
    private List<BorrowinDetailsDto> borrowdetailListr;

    public BorrowingBookDto(int serialNumber, String borrowId, String memberId, Date borrowingDate, List<BorrowinDetailsDto> borrowdetailListr) {
        this.serialNumber = serialNumber;
        this.borrowId = borrowId;
        this.memberId = memberId;
        this.borrowingDate = borrowingDate;
        this.borrowdetailListr = borrowdetailListr;
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

    public List<BorrowinDetailsDto> getBorrowdetailListr() {
        return borrowdetailListr;
    }

    public void setBorrowdetailListr(List<BorrowinDetailsDto> borrowdetailListr) {
        this.borrowdetailListr = borrowdetailListr;
    }

    @Override
    public String toString() {
        return "BorrowingBookDto{" + "serialNumber=" + serialNumber + ", borrowId=" + borrowId + ", memberId=" + memberId + ", borrowingDate=" + borrowingDate + ", borrowdetailListr=" + borrowdetailListr + '}';
    }
    
    
   
}

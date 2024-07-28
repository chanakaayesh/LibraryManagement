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
    private Date dueDate ;
    private Date returnedDate ;
    private double fine ;
}

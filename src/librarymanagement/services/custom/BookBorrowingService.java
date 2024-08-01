/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package librarymanagement.services.custom;

import java.util.List;
import librarymanagement.dto.BorrowingBookDto;
import librarymanagement.services.SuperService;

/**
 *
 * @author ayesh
 */
public interface BookBorrowingService extends SuperService {
 public   String saveBookBorrowing(BorrowingBookDto dto)throws Exception;
 public   String updateBookBorrowing(BorrowingBookDto dto)throws Exception;
  public  String deleteBookBorrowing(String Id)throws Exception;
  public  BorrowingBookDto getBookBorrowingById(String Id)throws Exception;
 public   List<BorrowingBookDto> getBookBorrowingList()throws Exception;
 public String getMaxmemberID()throws Exception;
  public int getNextSerial() throws Exception;
}

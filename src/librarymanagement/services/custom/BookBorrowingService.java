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
    String saveBookBorrowing(BorrowingBookDto dto)throws Exception;
    String updateBookBorrowing(BorrowingBookDto dto)throws Exception;
    String deleteBookBorrowing(String Id)throws Exception;
    BorrowingBookDto getBookBorrowingById(String Id)throws Exception;
    List<BorrowingBookDto> getBookBorrowingList()throws Exception;
}

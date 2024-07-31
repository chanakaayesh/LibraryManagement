/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package librarymanagement.services.custom;

import java.util.List;
import librarymanagement.dto.BookDto;
import librarymanagement.services.SuperService;

/**
 *
 * @author ayesh
 */
public interface BookService extends SuperService {
    
 public   String saveBook(BookDto dto)throws Exception;
 public   String updateBook(BookDto dto)throws Exception;
 public    String deleteBook(String Id)throws Exception;
 public   BookDto getBookById(String Id)throws Exception;
 public   List<BookDto> getBookList()throws Exception;
    
}

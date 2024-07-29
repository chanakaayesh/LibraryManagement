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
    
    String saveBook(BookDto dto)throws Exception;
    String updateBook(BookDto dto)throws Exception;
    String deleteBook(String Id)throws Exception;
    BookDto getBookById(String Id)throws Exception;
    List<BookDto> getBookList()throws Exception;
    
}

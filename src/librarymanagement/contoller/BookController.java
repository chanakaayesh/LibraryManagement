/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.contoller;

import java.util.List;
import librarymanagement.dto.BookDto;
import librarymanagement.enumContainer.EnumContainer;
import librarymanagement.services.Servicefactor;
import librarymanagement.services.custom.BookService;

/**
 *
 * @author ayesh
 */
public class BookController {
    
    BookService bookService = (BookService) Servicefactor.getInstance().getService(EnumContainer.ServiceType.BOOK);
    private static BookController instance;

    private BookController() {
    }
    
    public static BookController getInstance(){
        return instance ==null? instance = new BookController(): instance;
    }
    
    
    
    public String save(BookDto dto) throws Exception{
        
        return bookService.saveBook(dto);
    }
    
    public String update(BookDto dto) throws Exception{
    
         return bookService.updateBook(dto);
    }
    
    public String delete(String id)throws Exception{
     return bookService.deleteBook(id);
    }
    
    public BookDto getbookById(String id)throws Exception{
    
        return bookService.getBookById(id);
    }
    
    public List<BookDto> getBookList()throws Exception {
        return bookService.getBookList();
    }
    
}

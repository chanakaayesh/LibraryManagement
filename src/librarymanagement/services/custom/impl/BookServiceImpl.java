/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.services.custom.impl;

import java.util.ArrayList;
import java.util.List;
import librarymanagement.dao.DaoFactory;
import librarymanagement.dao.custome.BookDao;
import librarymanagement.dto.BookDto;
import librarymanagement.entity.BookEntity;
import librarymanagement.enumContainer.EnumContainer;
import librarymanagement.services.custom.BookService;

/**
 *
 * @author ayesh
 */
public class BookServiceImpl implements BookService{
    private BookDao bookDao = (BookDao)DaoFactory.getInstance().getDao(EnumContainer.DaoType.BOOK);
 

    @Override
    public String saveBook(BookDto dto) throws Exception {
            
       return bookDao.create(bookDtoToEntity(dto))?EnumContainer.databaseDateStatus.SUCCESS.getValue():EnumContainer.databaseDateStatus.FAIL.getValue();
        
    }

    @Override
    public String updateBook(BookDto dto) throws Exception {
   
     return bookDao.update(bookDtoToEntity(dto))?EnumContainer.databaseDateStatus.SUCCESS.getValue():EnumContainer.databaseDateStatus.FAIL.getValue();
    }

    @Override
    public String deleteBook(String Id) throws Exception {
     return bookDao.delete(Id)?EnumContainer.databaseDateStatus.SUCCESS.getValue():EnumContainer.databaseDateStatus.FAIL.getValue();
    }

    @Override
    public BookDto getBookById(String Id) throws Exception {
        
         return bookEntityToDto(bookDao.get(Id));
         
    }

    @Override
    public List<BookDto> getBookList() throws Exception {
        
        List<BookDto> bookList = new ArrayList<>();
        
       for(BookEntity entity : bookDao.getAll()){
           
           bookList.add(bookEntityToDto(entity));
       }
    
       return bookList;
    }
    
    private BookEntity bookDtoToEntity(BookDto dto){
    
        return new BookEntity(dto.getSerialNumber(), dto.getBookId(),
                dto.getCategoryId(), dto.getAuthor(), dto.getBookTitle(), dto.getPublishDate(), dto.getItemQuantity());
    }
    
      private BookDto bookEntityToDto(BookEntity entity){
    
        return new BookDto(entity.getSerialNumber(), entity.getBookId(),
                entity.getCategoryId(), entity.getAuthor(), entity.getBookTitle(), entity.getPublishDate(), entity.getItemQuantity());
    }
}

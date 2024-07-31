/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.services.custom.impl;

import java.util.ArrayList;
import java.util.List;
import librarymanagement.alert.AlertMessage;
import librarymanagement.dao.DaoFactory;
import librarymanagement.dao.custome.BookCategoryDao;
import librarymanagement.dto.BookCategoryDto;
import librarymanagement.entity.BookCategoryEntity;
import librarymanagement.enumContainer.EnumContainer;
import librarymanagement.services.custom.BookCategoryService;

/**
 *
 * @author ayesh
 */
public class BookCategoryServiceImpl implements BookCategoryService{

     private BookCategoryDao categoryDao = (BookCategoryDao)DaoFactory.getInstance().getDao(EnumContainer.DaoType.BOOKCATEGORY);
    @Override
    public String saveCategory(BookCategoryDto dto) throws Exception {
    
        BookCategoryEntity entity =categoryDtoToEntity(dto);
                  AlertMessage.getInstance().printMessage("BookCategoryServiceImpl:create "+entity);
        return categoryDao.create(entity)? EnumContainer.databaseDateStatus.SUCCESS.getValue():EnumContainer.databaseDateStatus.FAIL.getValue();
    }

    
    @Override
    public String updateCategory(BookCategoryDto dto) throws Exception {
         return categoryDao.update(categoryDtoToEntity(dto))? EnumContainer.databaseDateStatus.SUCCESS.getValue():EnumContainer.databaseDateStatus.FAIL.getValue();
    }

    @Override
    public String deleteCategory(String Id) throws Exception {
         return categoryDao.delete(Id)? EnumContainer.databaseDateStatus.SUCCESS.getValue():EnumContainer.databaseDateStatus.FAIL.getValue();
    }

    @Override
    public BookCategoryDto getCategoryById(String Id) throws Exception {
   
        return categoryEntityToDto(categoryDao.get(Id));
    }

    @Override
    public List<BookCategoryDto> getCategoryList() throws Exception {
        
        List<BookCategoryDto> dtoList = new ArrayList<>();
        for(BookCategoryEntity entity : categoryDao.getAll()){
            dtoList.add(categoryEntityToDto(entity));
        }
        
        return dtoList;
    }
    
    private BookCategoryEntity categoryDtoToEntity(BookCategoryDto dto){
    
        return new BookCategoryEntity(dto.getSerialNumber(), dto.getCategoryId(), dto.getCategoryName());
    }
    private BookCategoryDto categoryEntityToDto(BookCategoryEntity entity){
    
        return new BookCategoryDto(entity.getSerialNumber(), entity.getCategoryId(), entity.getCategoryName());
    }
    
}

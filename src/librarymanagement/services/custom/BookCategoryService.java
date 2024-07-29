/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package librarymanagement.services.custom;

import java.util.List;
import librarymanagement.dto.BookCategoryDto;
import librarymanagement.services.SuperService;

/**
 *
 * @author ayesh
 */
public interface BookCategoryService extends SuperService{
    String saveCategory(BookCategoryDto dto)throws Exception;
    String updateCategory(BookCategoryDto dto)throws Exception;
    String deleteCategory(String Id)throws Exception;
    BookCategoryDto getCategoryById(String Id)throws Exception;
    List<BookCategoryDto> getCategoryList()throws Exception;
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.contoller;

import java.util.List;
import librarymanagement.dto.BookCategoryDto;
import librarymanagement.enumContainer.EnumContainer;
import librarymanagement.services.Servicefactor;
import librarymanagement.services.custom.BookCategoryService;
import librarymanagement.services.custom.UserService;

/**
 *
 * @author ayesh
 */
public class CategoryController {
    
    private BookCategoryService category=(BookCategoryService) Servicefactor.getInstance().getService(EnumContainer.ServiceType.BOOKCATEGORY);
    private static CategoryController instance;

    private CategoryController() {
    }
    
    public static CategoryController getInstance(){
    
        return  instance ==null? instance = new CategoryController():instance;
    }
    
    public String save(BookCategoryDto dto) throws Exception{
        
        return category.saveCategory(dto);
    }
    
    public String update(BookCategoryDto dto) throws Exception{
    
         return category.updateCategory(dto);
    }
    
    public String delete(String id)throws Exception{
     return category.deleteCategory(id);
    }
    
    public BookCategoryDto getCategoryById(String id)throws Exception{
    
        return category.getCategoryById(id);
    }
    
    public List<BookCategoryDto> getCategoryList()throws Exception {
        return category.getCategoryList();
    }
}

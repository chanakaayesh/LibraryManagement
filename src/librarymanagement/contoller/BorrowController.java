/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.contoller;

import java.util.List;
import librarymanagement.dto.BorrowingBookDto;
import librarymanagement.enumContainer.EnumContainer;
import librarymanagement.services.Servicefactor;
import librarymanagement.services.custom.BookBorrowingService;

/**
 *
 * @author ayesh
 */
public class BorrowController {
    
    private static BorrowController instance;
    private BookBorrowingService borrowService =(BookBorrowingService) Servicefactor.getInstance().getService(EnumContainer.ServiceType.BORROWINGBOOK);
    
    
    private BorrowController() {
    }
    
    
    public static BorrowController getInstance(){
        return instance ==null?(instance=new BorrowController()):instance;
    }
    
       public String save(BorrowingBookDto dto) throws Exception{
        
        return borrowService.saveBookBorrowing(dto);
    }
    
    public String update(BorrowingBookDto dto) throws Exception{
    
         return borrowService.updateBookBorrowing(dto);
    }
    
    public String delete(String id)throws Exception{
     return borrowService.deleteBookBorrowing(id);
    }
    
    public BorrowingBookDto getBorrowDetailsById(String id)throws Exception{
    
        return borrowService.getBookBorrowingById(id);
    }
    
    public List<BorrowingBookDto> getBorrowList()throws Exception {
        return borrowService.getBookBorrowingList();
    }
    
    public int getNextSerial()throws Exception{
 
    return borrowService. getNextSerial();
    }
}

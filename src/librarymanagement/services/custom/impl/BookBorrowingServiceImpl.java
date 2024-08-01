/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.services.custom.impl;

import java.util.List;
import librarymanagement.dao.DaoFactory;
import librarymanagement.dao.custome.BorrowingBookDao;
import librarymanagement.dao.custome.BorrwoingBookDetailDao;
import librarymanagement.dto.BorrowingBookDto;
import librarymanagement.enumContainer.EnumContainer;
import librarymanagement.services.custom.BookBorrowingService;
import java.sql.Connection;
import java.util.ArrayList;
import librarymanagement.alert.AlertMessage;
import librarymanagement.dao.custome.BookDao;
import librarymanagement.db.DBConnection;
import librarymanagement.dto.BorrowinDetailsDto;
import librarymanagement.entity.BookEntity;
import librarymanagement.entity.BorrowinDetailsEntity;
import librarymanagement.entity.BorrowingBookEntity;

/**
 *
 * @author ayesh
 */
public class BookBorrowingServiceImpl implements BookBorrowingService{
    
       private BorrowingBookDao borrowingDao = (BorrowingBookDao)DaoFactory.getInstance().getDao(EnumContainer.DaoType.BORROWINGBOOK);
       private BorrwoingBookDetailDao borrowDetailDao = (BorrwoingBookDetailDao)DaoFactory.getInstance().getDao(EnumContainer.DaoType.BORROWINGDETAIL);
       private BookDao bookDao = (BookDao)DaoFactory.getInstance().getDao(EnumContainer.DaoType.BOOK);

    @Override
    public String saveBookBorrowing(BorrowingBookDto dto) throws Exception {
         Connection connection = DBConnection.getInstance().getConnection();
         
        
         try {
            connection.setAutoCommit(false);
           
         //   String borrowId = borrowingDao.getMaxmemberID();
            BorrowingBookEntity borrowEntity = getBorrowEntity(dto);
            
            if(borrowingDao.create(borrowEntity)){
                
                boolean isborrowingSaved = true;
                
                for(BorrowinDetailsDto borrowDetailsdto :dto.getBorrowdetailListr()){
                    
                 //   borrowDetailsdto.setBorrowId(borrowId);
                    if(!borrowDetailDao.create(getboorwDetailEntity(borrowDetailsdto))){
                            isborrowingSaved = false;
                    }
                }
                
                
                if(isborrowingSaved){
                    boolean isBookUpdated = true;
                    
                    for(BorrowinDetailsDto borrowDetailsdto :dto.getBorrowdetailListr()){
                        BookEntity bookEntity = bookDao.get(borrowDetailsdto.getBookId());
                        
                        if(bookEntity !=null){
                         bookEntity.setItemQuantity(bookEntity.getItemQuantity()-1);
                        if(!bookDao.update(bookEntity)){
                            isBookUpdated = false;
                        }
                        }
                       
                    }
                    
                    if(isBookUpdated){
                        
                        connection.commit();
                        return EnumContainer.databaseDateStatus.SUCCESS.getValue();
                    }else{
                        
                        connection.rollback();
                        return "error on updating book";
                    
                    }
                }else{
                    connection.rollback();
                    return "error on saving BorrowinDetailsD";
                }
                
                
            
            }else{
                
                connection.rollback();
                return "error on saving BookBorrowing";
            }
            
        } catch (Exception e) {
            connection.rollback();
            AlertMessage.getInstance().printMessage("Erro is : "+e.getMessage());
            throw e;
        } finally {
               connection.setAutoCommit(true);
        }
         
    }

    @Override
    public String updateBookBorrowing(BorrowingBookDto dto) throws Exception {
   
           Connection connection = DBConnection.getInstance().getConnection();
         
        
         try {
            connection.setAutoCommit(false);
          
            BorrowingBookEntity borrowEntity = getBorrowEntity(dto);
            
            if(borrowingDao.update(borrowEntity)){
                
                boolean isborrowingUpdated = true;
                
                List<BorrowinDetailsDto> prevousBorrowdetailsList = new ArrayList<>();
                for(BorrowinDetailsDto borrowDetailsdto :dto.getBorrowdetailListr()){
                    
                  BorrowinDetailsDto prevousBorrowdetails=getboorwDetailDto(borrowDetailDao.get(borrowDetailsdto.getBorrowId()));
                  prevousBorrowdetailsList.add(borrowDetailsdto);
                  if(borrowDetailDao.update(getboorwDetailEntity(borrowDetailsdto))){
                        
                            
                            isborrowingUpdated = false;
                    }
                }
                
                
                if(isborrowingUpdated){
                    boolean isBookUpdated = true;
                     int index = 0;
                    for(BorrowinDetailsDto borrowDetailsdto :dto.getBorrowdetailListr()){
                        BookEntity bookEntity = bookDao.get(borrowDetailsdto.getBookId());
                        
                        if(bookEntity !=null){
                            
                          /*  if we change update the bookId on borrowbook table that means we should fix book quantity for prevous 
                            book id . */
                            if(prevousBorrowdetailsList.get(index).getBookId().equals(bookEntity.getBookId())){
                                bookEntity.setItemQuantity(bookEntity.getItemQuantity()+1);
                                if(!bookDao.update(bookEntity)){
                                    isBookUpdated = false;
                                }
                            }
                            
                            //update book for new bookid
                         bookEntity.setItemQuantity(bookEntity.getItemQuantity()-1);
                        if(!bookDao.update(bookEntity)){
                            isBookUpdated = false;
                        }
                        }
                       index++;
                    }
                    
                    if(isBookUpdated){
                        
                        connection.commit();
                        return EnumContainer.databaseDateStatus.SUCCESS.getValue();
                    }else{
                        
                        connection.rollback();
                        return "error on updating book";
                    
                    }
                }else{
                    connection.rollback();
                    return "error on saving BorrowinDetailsD";
                }
                
                
            
            }else{
                
                connection.rollback();
                return "error on updating BookBorrowing";
            }
            
        } catch (Exception e) {
            connection.rollback();
            AlertMessage.getInstance().printMessage("Erro is : "+e.getMessage());
            throw e;
        } finally {
               connection.setAutoCommit(true);
        }
    
    }

    @Override
    public String deleteBookBorrowing(String Id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public BorrowingBookDto getBookBorrowingById(String Id) throws Exception {
               BorrowingBookEntity borrowingBookEntity= borrowingDao.get(Id);
         List<BorrowinDetailsDto> detailsList = new ArrayList<>();

        if (borrowingBookEntity.getBorrowId() != null) {
           

            List<BorrowinDetailsEntity> borrowDetails = borrowDetailDao.getByBorrowIdAll(borrowingBookEntity.getBorrowId());

            if (borrowDetails != null) {
                for (BorrowinDetailsEntity dto : borrowDetails) {
                    if (dto != null) { // Add null check here
                        detailsList.add(getboorwDetailDto(dto));
                    }
                }
            } 

          return  getBorrowDto(borrowingBookEntity, detailsList);
        }
        
        return null;
    }

    @Override
    public List<BorrowingBookDto> getBookBorrowingList() throws Exception {
      
       List<BorrowingBookDto> borrowingBookDtosList = new ArrayList<>();
       for(BorrowingBookEntity bbEntity:borrowingDao.getAll()){
          List<BorrowinDetailsDto> detailsList = new ArrayList<>();

        if (bbEntity.getBorrowId() != null) {
            AlertMessage.getInstance().printMessage("getBookBorrowingList getting id is < " + bbEntity.getBorrowId() + " >");

            List<BorrowinDetailsEntity> borrowDetails = borrowDetailDao.getByBorrowIdAll(bbEntity.getBorrowId());

            if (borrowDetails != null) {
                for (BorrowinDetailsEntity dto : borrowDetails) {
                    if (dto != null) { // Add null check here
                        detailsList.add(getboorwDetailDto(dto));
                    }
                }
            } 

            borrowingBookDtosList.add(getBorrowDto(bbEntity, detailsList));
        }
    }
       
       return borrowingBookDtosList;
    }
    
    
   private BorrowingBookEntity getBorrowEntity(BorrowingBookDto dto){
       
       return new BorrowingBookEntity(dto.getSerialNumber(), dto.getBorrowId(), dto.getMemberId(), dto.getBorrowingDate());
   
   }
   
   private BorrowingBookDto getBorrowDto(BorrowingBookEntity dto,List<BorrowinDetailsDto> borrowDetailsDto){
       
       return new BorrowingBookDto(dto.getSerialNumber(), dto.getBorrowId(), dto.getMemberId(), dto.getBorrowingDate(),borrowDetailsDto);
   
   }

   
   private BorrowinDetailsDto getboorwDetailDto(BorrowinDetailsEntity entity){
       
       return new BorrowinDetailsDto(entity.getBorrowId(), entity.getDueDate(), entity.getReturnedDate(), 
               entity.getFine(), entity.getBookId());
   
   }
   
     private BorrowinDetailsEntity getboorwDetailEntity(BorrowinDetailsDto dto){
       
       return new BorrowinDetailsEntity(dto.getBorrowId(), dto.getDueDate(), dto.getReturnedDate(), 
               dto.getFine(), dto.getBookId());
   
   }

    @Override
    public String getMaxmemberID() throws Exception {
        return borrowingDao.getMaxmemberID();
    }

    @Override
    public int getNextSerial() throws Exception {
       return borrowingDao.getNextSerial();
    }
}

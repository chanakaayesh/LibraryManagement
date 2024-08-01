/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package librarymanagement.view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import librarymanagement.alert.AlertMessage;
import librarymanagement.commmonUiMethods.CommandUIMethods;
import librarymanagement.contoller.BookController;
import librarymanagement.contoller.BorrowController;
import librarymanagement.contoller.MemberController;
import librarymanagement.dto.BorrowinDetailsDto;
import librarymanagement.dto.BorrowingBookDto;
import librarymanagement.enumContainer.EnumContainer;

/**
 *
 * @author ayesh
 */
public class BorrowBookView extends javax.swing.JPanel {

    /**
     * Creates new form BorrowBook
     */
    boolean isBorrowDetaildLoadFirdtTime =false;
    boolean isSearchBookFOund =false;
    List<BorrowinDetailsDto> addingBookList = new ArrayList<>();
    public BorrowBookView() {
        initComponents();
        borrowdateTextFieldEditerable(false);
        loadBorrowTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtf_bookId = new javax.swing.JTextField();
        btn_bkSearch = new javax.swing.JButton();
        lbl_bkDetails = new javax.swing.JLabel();
        lbl_bkCustomer = new javax.swing.JLabel();
        btn_bkCustomer = new javax.swing.JButton();
        txtf_customer = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_bkReturn = new javax.swing.JButton();
        btn_bkBorrow = new javax.swing.JButton();
        btn_bkUpdate = new javax.swing.JButton();
        btn_bkDelete = new javax.swing.JButton();
        txtf_borrowDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tbl_bkBorrowView = new javax.swing.JScrollPane();
        tbl_borrowView = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_borrowDetailTable = new javax.swing.JTable();
        btn_addBook = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Borrow Book");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Book ID");

        btn_bkSearch.setText("Search");
        btn_bkSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bkSearchActionPerformed(evt);
            }
        });

        lbl_bkDetails.setText("book details");

        lbl_bkCustomer.setText("Customer details");

        btn_bkCustomer.setText("Search");
        btn_bkCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bkCustomerActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Customer ID");

        btn_bkReturn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_bkReturn.setText("Return Book");
        btn_bkReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bkReturnActionPerformed(evt);
            }
        });

        btn_bkBorrow.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_bkBorrow.setText("Borrow Book");
        btn_bkBorrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bkBorrowActionPerformed(evt);
            }
        });

        btn_bkUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_bkUpdate.setText("Update");
        btn_bkUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bkUpdateActionPerformed(evt);
            }
        });

        btn_bkDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_bkDelete.setText("Delete");
        btn_bkDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bkDeleteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Borrow Date");

        tbl_borrowView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_bkBorrowView.setViewportView(tbl_borrowView);

        tbl_borrowDetailTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_borrowDetailTable);

        btn_addBook.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_addBook.setText("Add Book");
        btn_addBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtf_borrowDate, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtf_bookId, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(btn_bkSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lbl_bkDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtf_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(btn_bkCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lbl_bkCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btn_addBook, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_bkReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btn_bkUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_bkDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_bkBorrow, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tbl_bkBorrowView, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtf_bookId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_bkSearch)
                    .addComponent(lbl_bkDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtf_customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_bkCustomer)
                    .addComponent(lbl_bkCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_bkUpdate)
                    .addComponent(btn_bkDelete)
                    .addComponent(btn_bkReturn)
                    .addComponent(btn_addBook))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtf_borrowDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(tbl_bkBorrowView, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addComponent(btn_bkBorrow)
                .addGap(140, 140, 140))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_bkReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bkReturnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_bkReturnActionPerformed

    private void btn_bkBorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bkBorrowActionPerformed
        // TODO add your handling code here:
        saveBorrowBook();
    }//GEN-LAST:event_btn_bkBorrowActionPerformed

    private void btn_bkUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bkUpdateActionPerformed
        // TODO add your handling code here:
        updateBorrowData();
    }//GEN-LAST:event_btn_bkUpdateActionPerformed

    private void btn_bkDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bkDeleteActionPerformed
        // TODO add your handling code here:
        deleteBorrowdetail();
    }//GEN-LAST:event_btn_bkDeleteActionPerformed

    private void btn_bkSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bkSearchActionPerformed
        // TODO add your handling code here:
        searchBookById();
    }//GEN-LAST:event_btn_bkSearchActionPerformed

    private void btn_bkCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bkCustomerActionPerformed
        // TODO add your handling code here:
        searchCustomer();
    }//GEN-LAST:event_btn_bkCustomerActionPerformed

    private void btn_addBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addBookActionPerformed
        // TODO add your handling code here:
     
        
        addBookList();
    }//GEN-LAST:event_btn_addBookActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addBook;
    private javax.swing.JButton btn_bkBorrow;
    private javax.swing.JButton btn_bkCustomer;
    private javax.swing.JButton btn_bkDelete;
    private javax.swing.JButton btn_bkReturn;
    private javax.swing.JButton btn_bkSearch;
    private javax.swing.JButton btn_bkUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_bkCustomer;
    private javax.swing.JLabel lbl_bkDetails;
    private javax.swing.JScrollPane tbl_bkBorrowView;
    private javax.swing.JTable tbl_borrowDetailTable;
    private javax.swing.JTable tbl_borrowView;
    private javax.swing.JTextField txtf_bookId;
    private javax.swing.JTextField txtf_borrowDate;
    private javax.swing.JTextField txtf_customer;
    // End of variables declaration//GEN-END:variables


 private void loadBorrowTable() {
   
         try {
            
            String column[] = {"Serial no","Borrow Id","Customer Id"};
            DefaultTableModel dta = new DefaultTableModel(column,0){
            
                @Override
                public boolean isCellEditable(int row, int column){
                
                    return false;
                }
            };
            
            tbl_borrowView.setModel(dta);
           
            List<BorrowingBookDto> borrowList;
            
            borrowList =BorrowController.getInstance().getBorrowList();
            if(borrowList !=null){
                
             for(BorrowingBookDto dto : borrowList){
                 if(dto !=null){
                 
                   
               
                       Object[] rowdata ={dto.getSerialNumber(),dto.getBorrowId(),dto.getMemberId()};
                
                       dta.addRow(rowdata);
                       
                       if(!isBorrowDetaildLoadFirdtTime){
                           loadBorrowDetailsTable(dto.getBorrowdetailListr());
                           isBorrowDetaildLoadFirdtTime =true;
                       }
               
                 }
            
              
               
            }
            }
            
              
        } catch (Exception e) {
            AlertMessage.getInstance().showDialog(this, "Error at loading borrow data");
                AlertMessage.getInstance().printMessage("Borrow Loadtable eror 1"+e.getMessage());
        }
    }
 
  private void loadBorrowDetailsTable(List<BorrowinDetailsDto> DtoList) {
   
         try {
            
            String column[] = {"Book Id","return Date","Due Date","Fine"};
            DefaultTableModel dta = new DefaultTableModel(column,0){
            
                @Override
                public boolean isCellEditable(int row, int column){
                
                    return false;
                }
            };
            
            tbl_borrowDetailTable.setModel(dta);
           
            if(DtoList !=null){
             for(BorrowinDetailsDto dto : DtoList){
                 if(dto !=null){
                 
                   
               
                       Object[] rowdata ={dto.getBookId(),dto.getReturnedDate(),dto.getDueDate(),dto.getFine()};
                
                       dta.addRow(rowdata);
              
               
                 }
            
              
               
            }
            }
            
              
        } catch (Exception e) {
            AlertMessage.getInstance().showDialog(this, "Error at loading detail");
                AlertMessage.getInstance().printMessage("Borrow Loadtable eror 1"+e.getMessage());
        }
    }

    private void saveBorrowBook() {
        
        try {
            if(!lbl_bkDetails.getText().equals(EnumContainer.searchError.UNABLE.getValue()) &&
               !lbl_bkCustomer.getText().equals(EnumContainer.searchError.UNABLE.getValue()) 
                && addingBookList !=null
                    ){
                BorrowingBookDto borrowDto = new BorrowingBookDto(0, null, txtf_customer.getText(), CommandUIMethods.getInstance().getTodayDate(), addingBookList);
                if(BorrowController.getInstance().save(borrowDto).equals(EnumContainer.databaseDateStatus.SUCCESS.getValue())){
                        loadBorrowTable();
                }else{
                AlertMessage.getInstance().showDialog(this, "Error at saving data");
                }
            }else{
            AlertMessage.getInstance().showDialog(this, "add correct book andd customer Id first");
            }
            
            
        } catch (Exception e) {
             AlertMessage.getInstance().showDialog(this, "Error at loading data");
                AlertMessage.getInstance().printMessage("Borrow saveBorrowBook eror 1"+e.getMessage());
        }
     }

    private void searchBookById() {
  
        try {
            String bookName =BookController.getInstance().getbookById(txtf_bookId.getText()).getBookTitle();
            lbl_bkDetails.setText( bookName !=null? bookName:EnumContainer.searchError.UNABLE.getValue());
           
            
            
        } catch (Exception e) {
            lbl_bkDetails.setText(EnumContainer.searchError.UNABLE.getValue());
             AlertMessage.getInstance().showDialog(this, "Error at saving "+e.getMessage());
                AlertMessage.getInstance().printMessage("Borrow saveBorrowBook eror 1111"+e.getMessage());
        }
    }

    private void searchCustomer() {
    
        
        try {
            String customerName =MemberController.getInstance().getMemberByID(txtf_customer.getText()).getFirstName();
            lbl_bkCustomer.setText( customerName !=null? customerName:EnumContainer.searchError.UNABLE.getValue());
           
            
            
        } catch (Exception e) {
             AlertMessage.getInstance().showDialog(this, "Error at loading data");
              lbl_bkCustomer.setText( EnumContainer.searchError.UNABLE.getValue());
                AlertMessage.getInstance().printMessage("Borrow searchCustomer eror 1"+e.getMessage());
        }
    }

    
    private void borrowdateTextFieldEditerable(boolean isVisible){
        txtf_borrowDate.setEditable(isVisible);
    }

    private void updateBorrowData() {
        borrowdateTextFieldEditerable(false);
    
           
        try {
          
           
            
            
        } catch (Exception e) {
             AlertMessage.getInstance().showDialog(this, "Error at loading data");
                AlertMessage.getInstance().printMessage("Borrow updateBorrowData eror 1"+e.getMessage());
        }
    }

    private void deleteBorrowdetail() {
    
              borrowdateTextFieldEditerable(false);
    
           
        try {
          
           
            
            
        } catch (Exception e) {
             AlertMessage.getInstance().showDialog(this, "Error at loading data");
                AlertMessage.getInstance().printMessage("Borrow deleteBorrowdetail eror 1"+e.getMessage());
        }
    }

    private void addBookList() {
            //addingBookList
             try {
            if(!lbl_bkDetails.getText().equals(EnumContainer.searchError.UNABLE.getValue()) &&
               !lbl_bkCustomer.getText().equals(EnumContainer.searchError.UNABLE.getValue())  
                    ){
                
          BorrowinDetailsDto borrowDetailsDto =new BorrowinDetailsDto(("BW"+String.valueOf(BorrowController.getInstance().getNextSerial())), 
                        CommandUIMethods.getInstance().getReturnDate(), null, 0, lbl_bkDetails.getText());
                addingBookList.add(borrowDetailsDto);
                 AlertMessage.getInstance().showDialog(this, "book added success fully ");
            }else{
                AlertMessage.getInstance().showDialog(this, "Check whether you Enter Correct book id and Cutomer Id");
            }
            
            
        } catch (Exception e) {
             AlertMessage.getInstance().showDialog(this, "Error a taddBookList loading data");
                AlertMessage.getInstance().printMessage("Borrow addBookList eror 1"+e.getMessage());
        }  
            
    }
    
    
    
}

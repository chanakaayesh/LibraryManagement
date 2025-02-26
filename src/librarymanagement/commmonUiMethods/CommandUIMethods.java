/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.commmonUiMethods;

import java.awt.BorderLayout;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author ayesh
 */
public class CommandUIMethods {
    
    private static CommandUIMethods instance;

    private CommandUIMethods() {}
    
    public static CommandUIMethods getInstance(){
    
        return instance==null? instance = new CommandUIMethods():instance;
    }
    
  public boolean checkAllTextFieldIsfilled(String color,JTextField... txfList){
                boolean isAnyTxtfIsEmpty =false;
             for(JTextField txtf : txfList ){
                 
                 if(txtf.getText().isEmpty()){
                     isAnyTxtfIsEmpty =true;
                    // txtf.setBackground(Color.red);
                    
                    txtf.setBorder(new LineBorder(color.equals("red")?Color.RED:Color.GRAY, 2));
                     
                 }
                
             }
             return isAnyTxtfIsEmpty;
  }
     
    public void cleanTextField(JTextField... txfList ){
              
             for(JTextField txtf : txfList ){
                    txtf.setText("");
                 }
                
             
            
  }
  
    public void showView(JPanel mainJpanel,JPanel view) {
        mainJpanel.removeAll();
        mainJpanel.add(view, BorderLayout.CENTER);
        mainJpanel.revalidate();
        mainJpanel.repaint();
    }
    public void allowNumbersOnly(java.awt.event.KeyEvent evt){
      char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
                evt.consume();
        }
    }
    
    public Date getStringToDate(String dateString){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
         Date date = null; // Declare the date variable here

        try {
            date = sdf.parse(dateString); // Assign the parsed date to the variable
        } catch (ParseException e) {
            e.printStackTrace(); // Handle the exception
        }

        return date; // Return the dat
    }
     public String getToDateString(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
       

        return sdf.format(date); // Return the dat
    }
     
   

    public Date getReturnDate() {
          Date today = new Date();

    
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);
        
        calendar.add(Calendar.DAY_OF_MONTH, 15);
        Date dateAfter15Days = calendar.getTime();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return getStringToDate(sdf.format(dateAfter15Days)) ; 
    
    }
    public Date getTodayDate(){
         Date today = new Date();
         
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
     return getStringToDate(sdf.format(today)) ; 
    }
     
}

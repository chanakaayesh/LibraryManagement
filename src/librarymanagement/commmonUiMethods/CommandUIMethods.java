/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.commmonUiMethods;

import java.awt.BorderLayout;
import java.awt.Color;
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
}

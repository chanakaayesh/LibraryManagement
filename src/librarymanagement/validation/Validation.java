/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.validation;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author ayesh
 */
public class Validation {
    
    private static Validation instance;

    private Validation() {}
    
    public static Validation getInstance(){
    
        return instance==null? instance = new Validation():instance;
    }
    
     public boolean checkAllTextFieldIsfilled(JTextField... txfList ){
                boolean isAnyTxtfIsEmpty =false;
             for(JTextField txtf : txfList ){
                 
                 if(txtf.getText().isEmpty()){
                     isAnyTxtfIsEmpty =true;
                    // txtf.setBackground(Color.red);
                    txtf.setBorder(new LineBorder(Color.RED, 2));
                     
                 }
                
             }
             return isAnyTxtfIsEmpty;
    }
}

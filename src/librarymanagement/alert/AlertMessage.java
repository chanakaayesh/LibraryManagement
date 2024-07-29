/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.alert;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author ayesh
 */
public class AlertMessage {
       private static AlertMessage alertMessage;

    private AlertMessage() {
    }
    
    public static AlertMessage getInstance(){
    
        return alertMessage ==null? alertMessage =new AlertMessage():alertMessage;
    }
    
    public void showDialog(Component parentComponent, String message){
         JOptionPane.showMessageDialog(parentComponent, message);
    }
    
    public void printMessage(String message){

        System.out.println(message);
    }
}

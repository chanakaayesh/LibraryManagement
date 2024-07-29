/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement.dao;

import java.sql.ResultSet;
import librarymanagement.alert.AlertMessage;

/**
 *
 * @author ayesh
 */
public class CommonDbfunctions {
    
    private static CommonDbfunctions instance;

    public CommonDbfunctions() {
    }
    
    
    public static CommonDbfunctions getInstance(){
    
        return instance ==null? instance = new CommonDbfunctions():instance;
    }
    
    
      public String generateNewStringID(String sql,String idLetter)throws Exception{
     int maxId=0;
        ResultSet result =CrudUtil.excuteQuery(sql );
        
        if(result.next()){
            maxId   =result.getInt("lastSerialNumber");
        }
        
         AlertMessage.getInstance().printMessage("book geting mx id"+(maxId ==0? idLetter+1:idLetter+(maxId)));
 
        return  maxId ==0? idLetter+1:idLetter+(maxId+1);
    }
}

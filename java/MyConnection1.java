
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AFREEN
 */
public class MyConnection1 {
    
    
    public static Connection getcon(){
            Connection cn=null;

       try{
           
        Class.forName("com.mysql.jdbc.Driver");
 cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/aa","root","afreen"); 

       }
       
       catch(Exception e)
       {
           
           e.printStackTrace();
       }
        
        return cn;
    }
}
    
    
    
    
    
   


import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.interceptor.ServletRequestAware;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AFREEN
 */
public class Addtofavourites extends ActionSupport implements ServletRequestAware {
    
    HttpServletRequest request;
    
    public String auth()
    {
        try{
       Connection con=MyConnection1.getcon();
            
         String l=(String)request.getParameter("bkk");
     
            HttpSession hp=request.getSession(false);
           String m1= (String)hp.getAttribute("uname");
         
            
            PreparedStatement pm = con.prepareStatement("insert into favourites values(?,?)");
            pm.setString(1,l);
             pm.setString(2,m1);
            
           int i=  pm.executeUpdate();
     
            
              
       
              
 if(i>0)
{      
     request.setAttribute("mg","Book added successfully to MyBookList ");

return SUCCESS;
        }
 else
 {
     request.setAttribute("mg1","Please aadd again ");
     return ERROR;
 }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        
        
       return ERROR; 
        
        
    }
    
    
    @Override
    public void setServletRequest(HttpServletRequest hsr) {
this.request=hsr;
    }
    
}

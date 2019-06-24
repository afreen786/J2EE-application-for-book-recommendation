
import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class mybookaction extends ActionSupport implements ServletRequestAware {

    
     HttpServletRequest request;
    public String le()
    {
        
        HttpSession hs=request.getSession(false);  
        String n=(String)hs.getAttribute("uname");
        
        
       try
       {
      Connection con=MyConnection1.getcon();
            
             PreparedStatement pm = con.prepareStatement("select* from book where uname=?");
            pm.setString(1,n);
      
             
      ResultSet rs= pm.executeQuery();
            
              
       
              
 if(rs.next())
{    request.setAttribute("rs1",rs);
return SUCCESS;
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

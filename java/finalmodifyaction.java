
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
public class finalmodifyaction extends ActionSupport implements ServletRequestAware {
HttpServletRequest request;
  

public String le() {
            
        
     try{
         HttpSession hs=request.getSession(false);
         String n=(String)request.getParameter("bkk3");
            String n1=(String)request.getParameter("role1");
               String n2=(String)request.getParameter("des");
         
            Connection con=MyConnection1.getcon();
           System.out.print(n);
            PreparedStatement pm;
            if(n1.contains("book6"))
            {
              pm = con.prepareStatement("update book set name=? where name=?");
            }
            else if(n1.contains("book1"))
            {
             pm = con.prepareStatement("update book set author=? where name=?");
            }
            else if(n1.contains("book2"))
            {
              pm = con.prepareStatement("update book set price=? where name=?");
            }
            else if(n1.contains("book3"))
            {
            pm = con.prepareStatement("update book set genre=? where name=?");
            }
           
            else 
            {
             pm = con.prepareStatement("update book set description=? where name=?");
            }
             pm.setString(1,n2);
             pm.setString(2,n);
       int i=pm.executeUpdate();
      
        
        if(i>0)
        {
         
          request.setAttribute("mg","Book modified successfully  ");
             return SUCCESS;
      
        }
        else
          {
         
          request.setAttribute("mg1","fail");
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

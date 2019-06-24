
import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class deletebookaction extends ActionSupport implements ServletRequestAware {
 
    HttpServletRequest request;
     public String le()
    {
        try{
      
            
         String l=(String)request.getParameter("bkk1");
     
           
          Connection con=MyConnection1.getcon();
            
            PreparedStatement pm = con.prepareStatement("Delete from book where name=?");
            pm.setString(1,l);
       
           int i=  pm.executeUpdate();
     
            
              
       
              
 if(i>0)
{      
     request.setAttribute("mg","Book deleted successfully  ");

return SUCCESS;
        }
 else
 {
     request.setAttribute("mg1","Please delete again ");
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

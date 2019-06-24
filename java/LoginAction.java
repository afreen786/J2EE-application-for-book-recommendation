
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
public class LoginAction extends ActionSupport implements ServletRequestAware {
    private String name;
        private String password;
HttpServletRequest request;
    /**
     * @return the name
     */
        public String auth()
        {
            try{
            Connection con=MyConnection.getcon();
            
           PreparedStatement pm = con.prepareStatement("select* from user where name=? and pass=?");
            pm.setString(1,name);
             pm.setString(2,password);
            
              
              ResultSet rs= pm.executeQuery();
            
              
       
              
 if(rs.next())
{      HttpSession hs=request.getSession(true);  
            hs.setAttribute("uname",name);
return SUCCESS;







}
 else
 {
     
      request.setAttribute("msg","Please enter correct username or password");
     return ERROR;
     
     
     
     
     
     
     
 }
 
 
 
 
 
 
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            
            return ERROR;
        }
        
        
        
        
        
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void setServletRequest(HttpServletRequest hsr) {
        this.request=hsr;
    }
    
}

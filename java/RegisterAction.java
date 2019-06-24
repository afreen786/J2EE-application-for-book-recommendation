
import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
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
public class RegisterAction extends ActionSupport implements ServletRequestAware {
    
    private String name,password,city,email;
HttpServletRequest request;
    /**
     * @return the name
     */
public String register()
{
    
    
    
     try{
            Connection con=MyConnection.getcon();
            
             PreparedStatement pm = con.prepareStatement("Insert into user values(?,?,?,?)");
            pm.setString(1,name);
             pm.setString(2,password);
             pm.setString(3,city);
              pm.setString(4,email);
             
        int y=pm.executeUpdate();
        
        
        if(y>0)
        {
                 
 return SUCCESS;
      
        }
        else
        {
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

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setServletRequest(HttpServletRequest hsr) {
       this.request=hsr;
    }
}

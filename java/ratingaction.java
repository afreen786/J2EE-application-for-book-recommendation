
import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class ratingaction extends ActionSupport implements ServletRequestAware  {

private float rating;
HttpServletRequest request;
private String rate;

public String le()
{
    
    
     
    
     try{
         
            Connection con=MyConnection1.getcon();
            
             PreparedStatement pm = con.prepareStatement("select*from book where name=?");
            
             pm.setString(1,rate);
       ResultSet rs=pm.executeQuery();
        
        
        if(rs.next())
        {
         
            
            Float k=rs.getFloat("rating");
            k=(k+rating)/2;
            
             PreparedStatement pm1 = con.prepareStatement("update book set rating=? where name=?");
            pm1.setFloat(1,k);
             pm1.setString(2,rate);
             int i=pm1.executeUpdate();
             if(i>0)
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

    /**
     * @return the rating
     */
    public float getRating() {
        return rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(float rating) {
        this.rating = rating;
    }

    /**
     * @return the rate
     */
    public String getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(String rate) {
        this.rate = rate;
    }
    
}

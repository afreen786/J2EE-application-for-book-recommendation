
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
public class searchbar extends ActionSupport implements ServletRequestAware{
    
    private String search;
HttpServletRequest request;
    /**
     * @return the search
     */
public String le()
{
     String k= request.getParameter("search");
        
          try{
            Connection con=MyConnection1.getcon();
            
      PreparedStatement pm = con.prepareStatement("select* from book where genre=?");
pm.setString(1, k);
              
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











    public String getSearch() {
        return search;
    }

    /**
     * @param search the search to set
     */
    public void setSearch(String search) {
        this.search = search;
    }

    @Override
    public void setServletRequest(HttpServletRequest hsr) {
       this.request=hsr;
    }
    
    
    
    
    
}

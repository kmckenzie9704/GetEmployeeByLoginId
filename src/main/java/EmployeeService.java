package main.java;

import java.util.List;
import javax.ws.rs.GET; 
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Produces; 
import javax.ws.rs.core.MediaType;  
@Path("/getEmployeeByLoginId") 

public class EmployeeService {
	   EmployeeDao empDao = new EmployeeDao();  
	   @GET 
	   /*
	   @Consumes(MediaType.TEXT_PLAIN) 
	   public int getEmployeeByLoginId(@QueryParam("strLogin") String strLogin, @QueryParam("strPassword") String strPassword){ 

		   int intEmployeeCount = 0;
	      try {
	    	  intEmployeeCount = empDao.getEmployeeByLoginId(strLogin, strPassword);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	      
        return intEmployeeCount;
	   }  
	   */
	   @Produces(MediaType.APPLICATION_JSON) 
	   public List<Employee> getEmployeeByLoginId(@QueryParam("strLogin") String strLogin, @QueryParam("strPassword") String strPassword) { 
		   List<Employee> lstProject = null;
	      try {
	    	  lstProject = empDao.getEmployeeByLoginId(strLogin, strPassword);
		} catch (Exception e) {
			e.printStackTrace();
		} 

	      return lstProject;
	   }
}

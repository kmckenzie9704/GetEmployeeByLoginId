package main.java;

import java.io.Serializable;  
import javax.xml.bind.annotation.XmlElement; 
import javax.xml.bind.annotation.XmlRootElement; 
@XmlRootElement(name = "employee") 

public class Employee implements Serializable {  
	   private static final long serialVersionUID = 1L; 
	   private String employeeId; 
	   private String employeeFirstName; 
	   private String employeeLastName;  
	   private String employeeRoleId;
	   private String employeeLogin;
	   private String employeePassword;
	   private int employeeNumber;
	   private int employeeCount;

	   public Employee(){} 
	    
	   public Employee(String id, String name, String employeeLastName){  
	      this.employeeId = id; 
	      this.employeeFirstName = name; 
	      this.employeeLastName = employeeLastName; 
	   }  
	   
	   public String getemployeeId() { 
	      return employeeId; 
	   }  
	   
	   @XmlElement 
	   public void setEmployeeId(String stremployeeId) { 
	      this.employeeId = stremployeeId; 
	   } 
	   
	   public String getEmployeeFirstName() { 
	      return employeeFirstName; 
	   } 
	   
	   @XmlElement
	   public void setEmployeeFirstName(String stremployeeFirstName) { 
	      this.employeeFirstName = stremployeeFirstName; 
	   } 
	   
	   public String getemployeeLastName() { 
	      return employeeLastName; 
	   } 
	   
	   @XmlElement 
	   public void setEmployeeLastName(String stremployeeLastName) { 
	      this.employeeLastName = stremployeeLastName; 
	   }   

	   public String getEmployeeRoleId() { 
		      return employeeRoleId; 
		   } 
		   
	   @XmlElement 
	   public void setEmployeeRoleId(String stremployeeRoleId) {
	      this.employeeRoleId = stremployeeRoleId; 
	   }   

	   public int getEmployeeNumber() { 
		      return employeeNumber; 
	   } 
		   
	   public int getEmployeeCount() { 
		      return employeeCount; 
	   } 
		   
	   public String getemployeeLogin() { 
		      return employeeLogin; 
		   } 
		   
	   @XmlElement 
	   public void setEmployeeLogin(String stremployeeLogin) { 
	      this.employeeLogin = stremployeeLogin; 
	   }   

	   public String getEmployeePassword() { 
		      return employeePassword; 
		   } 
			   
	   @XmlElement 
	   public void setEmployeePassword(String stremployeePassword) { 
	      this.employeePassword = stremployeePassword; 
	   }   

	   @XmlElement 
	   public void setEmployeeNumber(int intemployeeNumber) { 
	      this.employeeNumber = intemployeeNumber; 
	   }   
	   
	   @XmlElement 
	   public void setEmployeeCount(int intemployeeNumber) { 
	      this.employeeCount =intemployeeNumber;
	   }
}
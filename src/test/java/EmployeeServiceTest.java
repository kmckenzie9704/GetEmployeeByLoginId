package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.EmployeeService;

class EmployeeServiceTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

    String message = "Sample Unit Test.";	
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void TestGetEmployee() {	  
    	EmployeeService empService = new EmployeeService();
    	String strLogin = "yyy"; 
    	String strPassword = "xxx";
    	int intEmployees = empService.getEmployeeByLoginId(strLogin, strPassword);
    	assertNotEquals(intEmployees,2);
       assertEquals(message,messageUtil.printMessage());
    }

}

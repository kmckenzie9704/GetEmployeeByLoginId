package test.java;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.Employee;
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
    	List<Employee> lstEmployeeCount = empService.getEmployeeByLoginId(strLogin, strPassword);
    	String strNull = "Test";
    	Employee empCurrent = lstEmployeeCount.get(0);
    	int intCount = empCurrent.getEmployeeCount();
    	assertEquals(0, intCount);
       assertEquals(message,strNull);
    }

}

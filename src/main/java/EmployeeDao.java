package main.java;

import java.sql.*;


public class EmployeeDao {
	
	public int getEmployeeByLoginId(String strLogin, String strPassword) throws Exception { 		      
	int intCount = 0; 

	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		String strDBHost = System.getenv("ICE_GETPROJECTS_DB_HOST");
		String strDBPort = System.getenv("ICE_GETPROJECTS_DB_PORT");
		String strDBUser = System.getenv("ICE_GETPROJECTS_DB_USER");
		String strDBPassword = System.getenv("ICE_GETPROJECTS_DB_PASSWORD");
		String strDBTable = "TimeTracking";
		String strConnStr = "";
		
    	StringBuilder sblConnectionString = new StringBuilder();
    	sblConnectionString.append("jdbc:mysql://");
    	sblConnectionString.append(strDBHost);
    	sblConnectionString.append(":");
    	sblConnectionString.append(strDBPort);
    	sblConnectionString.append("/");
    	sblConnectionString.append(strDBTable);
    	sblConnectionString.append("?autoReconnect=true&useSSL=false");
    	strConnStr = sblConnectionString.toString();

//		"jdbc:mysql://192.168.56.101:3306/TimeTracking?autoReconnect=true&useSSL=false", "timaccess", "hgYT65^%");

		
		Connection m_Connection = DriverManager.getConnection(strConnStr, strDBUser, strDBPassword);

		Statement m_Statement = m_Connection.createStatement();
		String query = "SELECT COUNT(*) FROM Employees WHERE empLogin = '" + strLogin + "' AND empPassword = '" + strPassword + "'";

		ResultSet m_ResultSet = m_Statement.executeQuery(query);
		m_ResultSet.next();
		intCount = m_ResultSet.getInt(1);
		
		m_ResultSet.close();
		m_Statement.close();
		m_Connection.close();
    } 
	catch (SQLException se) {
		se.printStackTrace();
	}

	return intCount; 
	}
}

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

import java.sql.SQLException;

public class Metadata {

	public static void main(String[] args) throws SQLException {
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college_mgt","root","");
			DatabaseMetaData dbmd=con.getMetaData();
			System.out.println("Driver name:"+dbmd.getDriverName());
			System.out.println("Driver version:"+dbmd.getDriverVersion());
			System.out.println("Database product name:"+dbmd.getDatabaseProductName());
			System.out.println("Database user name:"+dbmd.getUserName());
			System.out.println("Database product version:"+dbmd.getDatabaseProductVersion());
			System.out.println("Database URL Name:"+dbmd.getURL());
			System.out.println("Database Major Version:"+dbmd.getDatabaseMajorVersion());
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	
	}

}
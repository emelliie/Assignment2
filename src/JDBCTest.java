import java.sql.*;
import java.sql.DriverManager;

public class JDBCTest {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
try {
	Class.forName("com.microsoft.sqlserver.jdbc.SQLserverDriver");
} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	
	String url = "jdbc:sqlserver://localhost:1433;DatabaseName=Demo Database NAV (5-0);";
	String user = "EmelieJavaSQL";	
	String pass = "panda3"; 
	
	
	try {
	
	
	Connection con = DriverManager.getConnection(url, user, pass);
	String query = "SELECT * FROM DEMO DATATBASE NAV (5-0);";
	PreparedStatement ps = con.prepareStatement(query);
	ResultSet rs = ps.executeQuery();
	
	while(rs.next()) {
		System.out.println(rs.getString(1));
	}
	
	}
  
	catch(SQLException e) {
	e.printStackTrace();
	
    }
	
   }
}

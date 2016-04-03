import java.util.*;
import java.sql.*;
import sun.jdbc.odbc.*;

public class JdbcDriverTest
{
	public static void main( String[] args )
	throws SQLException
	{
		Connection con;
		try{
			Class.forName( "com.mysql.jdbc.Driver");
			
			//con = DriverManager.getConnection( "jdbc:mysql://localhost/testdb","root","12345" );
		
			//Statement s = con.createStatement();
		
		
			//  int flag = s.executeUpdate( "insert into testtable values( 33,'imtiaz' )" );
            //  System.out.println("rows effected:"+flag);
		
			System.out.println( "table create successfully" );
			
		
		}
		catch( ClassNotFoundException e )
		{
			System.out.println( "Class not loaded" );
		}
		
		
	}
}
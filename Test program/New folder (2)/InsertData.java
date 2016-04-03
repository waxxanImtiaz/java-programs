import java.sql.*;
import java.lang.*;
public class InsertData
{
	public static void main( String[] args )
	{
		
		
	try{
		
	System.out.println( "Connection successful" );
	Class.forName( "com.mysql.jdbc.Driver" );
	
	Connection con = DriverManager.getConnection( "jdbc:mysql://localhost/testdb","root","12345");
	
	System.out.println( "Connection successful" );
	
	Statement st = con.createStatement();
	
	//int count = st.executeUpdate( "insert into testTable(name) values( 'kamran' )" );
	//System.out.println( count+" rows effected" );
	ResultSet rs = st.executeQuery( "select*from testTable" );
	ResultSetMetaData metaData = rs.getMetaData();
	int column = metaData.getColumnCount();

	for( int i = 1; i<column; i++)
	{
	System.out.printf( "%-30s" , metaData.getColumnName( i ));
	
	}
	
	System.out.println();
	
	while( rs.next() )
	{
	  for( int j = 1; j<= column; j++ )
		System.out.printf( "%-20s\t\t" , rs.getObject( j ));
		System.out.println();
	
	}
	
	}catch( SQLException e )
	{
		System.out.println( "Connection failed" );
	}
	catch( ClassNotFoundException e ){
		System.out.println( "Class not found." );
	}
	finally{
		rs.close();
	}
	}//end of main method
}
import java.sql.*; 
import java.awt.BorderLayout;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.*;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.AbstractTableModel;

import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
public class JdbcEx { 
public static void main (String args[ ]) { 
	
try { 
//Step 2: load driver 
Class.forName("com.mysql.jdbc.Driver"); 
//Step 3: define the connection URL 
String url = "jdbc:mysql://localhost/duet_result_management"; 
//Step 4: establish the connection 
Connection con = DriverManager.getConnection(url,"root","12345"); 
//Step 5: create Statement 
Statement st = con.createStatement(); 
//Step 6: preapare & execute the query 
String sql = "select s.subname,s.creditHours,s.totalMarks,f.obtainedmarks,f.subject_gpa from cs_subjects as s inner join firstsemester_cs13 as f on s.subid = f.subid and f.rollNumber =1"; 
ResultSet rs = st.executeQuery(sql); 
//Step 7: process the results
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
/*
while(rs.next()){ 
// The row name is “name” in database “PersonInfo, 
// hence specified in the getString() method. 
String name = rs.getString("orderName"); 
//String add  = rs.getString("Firstname"); 
//String pNum = rs.getString("city"); 
    System.out.println(name); //+ " " + add +" " + pNum); 
} */
//Step 8: close the connection 
con.close(); 
}catch(Exception sqlEx){ 
    System.out.println(sqlEx); 
} 
//	new DisplayQueryResult();

    } // end main 
} // end class

 class DisplayQueryResult extends JFrame {

	static final String DATABASE_URL = "jdbc:mysql://localhost/game";
	static final String USERNAME = " root ";
	static final String PASSWORD = "12345";
	static final String DEFAULT_QUERY = "select*from persons";
	private ResultSetTableModel tableModel;
	
	public DisplayQueryResult()
	{
		super(" Displaying Query Results ");
		
		try{
			tableModel = new ResultSetTableModel( DATABASE_URL,USERNAME,PASSWORD ,DEFAULT_QUERY);
			
			JTable resultTable = new JTable( tableModel );
			add( new JScrollPane( resultTable ),BorderLayout.CENTER );
			
		}catch( SQLException e )
		{
			JOptionPane.showMessageDialog(null,e.getMessage(),"Database error",JOptionPane.ERROR_MESSAGE);
			tableModel.disconnectFromDatabase();
			System.exit( 1 );
		}
		
		setDefaultCloseOperation( DISPOSE_ON_CLOSE );
		
		addWindowListener( new WindowAdapter() 
		{
			public void windowClosed( WindowEvent e )
			{
				tableModel.disconnectFromDatabase();
				System.exit( 0 );
			}
		});
	}
	
	
			
}

class ResultSetTableModel extends AbstractTableModel
{
	private Connection connection;
	private Statement statement;
	private ResultSet resultSet;
	private ResultSetMetaData metaData;
	private int numberOfRows;
	
	private boolean connectedToDatabase = false;
	
	public ResultSetTableModel( String url,String username,String password,String query ) throws SQLException
	{
		try{
		Class.forName("com.mysql.jdbc.Driver"); 
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
		connection = DriverManager.getConnection( url,username,password);
		
		statement = connection.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY );
		
		connectedToDatabase = true;
		setQuery( query );
	}
	
	public Class getColumnClass( int column ) throws IllegalStateException
	{
		if( !connectedToDatabase )
		{
			throw new IllegalStateException( "Not Connected to Database" );
		}
		try{
			String className = metaData.getColumnClassName( column+1 );
			return Class.forName( className );
		}
		catch( Exception e  )
		{
			e.printStackTrace();
		}
		return Object.class;
	}
	public int getColumnCount() throws IllegalStateException
	{
		if( !connectedToDatabase )
		{
			throw new IllegalStateException( "Not Connected to Database" );
		}
		try{
			return metaData.getColumnCount();
		}
		catch( SQLException e  )
		{
			e.printStackTrace();
		}
		return 0;
	}
	public String getColumnName( int column ) throws IllegalStateException
	{
		if( !connectedToDatabase )
		{
			throw new IllegalStateException( "Not Connected to Database" );
		}
		try{
			return metaData.getColumnName( column+1 );
		}
		catch( SQLException e  )
		{
			e.printStackTrace();
		}
		return "";
	}
	public int getRowCount() throws IllegalStateException
	{
		if( !connectedToDatabase )
		{
			throw new IllegalStateException( "Not Connected to Database" );
		}
		return numberOfRows;
	}
	public Object getValueAt( int row,int column )
	{
		if( !connectedToDatabase )
		{
			throw new IllegalStateException( "Not Connected to Database" );
		}
		try{
			 resultSet.absolute(  column+1 );
			 return resultSet.getObject( column+1 );
		}
		catch( SQLException e  )
		{
			e.printStackTrace();
		}
		return "";
	}
	
	public void setQuery( String query ) throws SQLException,IllegalStateException
	{
		if( !connectedToDatabase )
		{
			throw new IllegalStateException( "Not Connected to Database" );
		}
		
		resultSet = statement.executeQuery(  query );
		
		metaData = resultSet.getMetaData();
		
		resultSet.last();
		numberOfRows = resultSet.getRow();
		
		fireTableStructureChanged();
	}
	public void disconnectFromDatabase()
	{
		if( connectedToDatabase )
		{
			try{
				resultSet.close();
				statement.close();
				connection.close();
			}catch( SQLException e )
			{
				e.printStackTrace();
			}
			finally
			{
				connectedToDatabase = false;
			}
		}
	}//end of ResultSetTableModel class........
}







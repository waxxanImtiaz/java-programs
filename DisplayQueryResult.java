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
import java.sql.PreparedStatement;
public class DisplayQueryResult extends JFrame {


	static final String DEFAULT_QUERY = "select*from cs13";
	private ResultSetTableModel tableModel;
	
	
	public DisplayQueryResult()
	{
		
		
		
		try{
			tableModel = new ResultSetTableModel(DEFAULT_QUERY);
			
			JTable resultTable = new JTable( tableModel );
			add( new JScrollPane( resultTable ),BorderLayout.SOUTH );
			
		}catch( SQLException e )
		{
			JOptionPane.showMessageDialog(null,e.getMessage(),"Database error",JOptionPane.ERROR_MESSAGE);
			tableModel.disconnectFromDatabase();
			System.exit( 1 );
		}
		
		
		
		
	}
}

 class ResultSetTableModel extends AbstractTableModel
{
	private Connection connection;
	private Statement statement;
	private ResultSet resultSet;
	private ResultSetMetaData metaData;
	private int numberOfRows;
	private PreparedStatement preparedStatement = null;
	
	private boolean connectedToDatabase = false;
	
	public ResultSetTableModel( String query ) throws SQLException
	{
		try{
		Class.forName("com.mysql.jdbc.Driver"); 
		connection = DriverManager.getConnection( "jdbc:mysql://localhost/duet_result_management","root","12345");
		
		statement = connection.createStatement( );
		

		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
		
		connectedToDatabase = true;
		setQuery( query );
	}
	public ResultSetTableModel() //throws SQLException
	{
		try{
			Class.forName("com.mysql.jdbc.Driver"); 
			connection = DriverManager.getConnection( "jdbc:mysql://localhost/duet_result_management","root","12345");
			
			statement = connection.createStatement( );
			

			}
			catch( SQLException e  )
			{
				e.printStackTrace();
			}
			catch( Exception e )
			{
				e.printStackTrace();
			}
		connectedToDatabase = true;
			
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
			 resultSet.absolute(  row+1 );
			 return resultSet.getObject( column+1 );
		}
		catch( SQLException e  )
		{
			e.printStackTrace();
		}
		return "";
	}
	
	public void setQuery( String query ) 
	{
		try{
		if( !connectedToDatabase )
		{
			throw new IllegalStateException( "Not Connected to Database" );
		}
		
		connection = DriverManager.getConnection( "jdbc:mysql://localhost/duet_result_management","root","12345");
		
		preparedStatement = connection.prepareStatement( query );
		resultSet = preparedStatement.executeQuery();
		metaData = resultSet.getMetaData();
		resultSet = statement.executeQuery(  query );
		
		resultSet.last();
		numberOfRows = resultSet.getRow();
		
		}
		catch( IllegalStateException e )
		{
			e.printStackTrace();
		}
		catch( SQLException e){
			e.printStackTrace();
		}
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
	public String executeQuery( String query,String colName )
	{
		String x = " ";
		
		 
		if( !connectedToDatabase )
			throw new IllegalStateException( "Not Connected to Database" );
		
		try{
			resultSet = statement.executeQuery(  query );
			while( resultSet.next() )
			{
			x = resultSet.getString( colName );
			//System.out.println( x );
			}  
		}catch( SQLException e )
		{
			e.printStackTrace();
		}
		  return x; 
	}
	
}






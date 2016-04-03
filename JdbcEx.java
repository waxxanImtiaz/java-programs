import java.sql.*; 
public class JdbcEx { 
public static void main (String args[ ]) { 
try { 
//Step 2: load driver 
Class.forName("com.mysql.jdbc.Driver"); 
//Step 3: define the connection URL 
String url = "jdbc:mysql://localhost/game"; 
//Step 4: establish the connection 
Connection con = DriverManager.getConnection(url,"root","12345"); 
//Step 5: create Statement 
Statement st = con.createStatement(); 
//Step 6: preapare & execute the query 
String sql = "SELECT * FROM orders"; 
ResultSet rs = st.executeQuery(sql); 
//Step 7: process the results 
while(rs.next()){ 
// The row name is “name” in database “PersonInfo, 
// hence specified in the getString() method. 
String name = rs.getString("orderName"); 
//String add  = rs.getString("Firstname"); 
//String pNum = rs.getString("city"); 
    System.out.println(name); //+ " " + add +" " + pNum); 
} 
//Step 8: close the connection 
con.close(); 
}catch(Exception sqlEx){ 
    System.out.println(sqlEx); 
} 
    } // end main 
} // end class
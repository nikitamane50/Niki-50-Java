import java.sql.*;
public class DropTable{
public static void main(String[] args){
try{
Connection con = DriverManager.getConnection("jdbc:mysql:///Student","root","root");
Statement st = con.createStatement();
st.executeUpdate("drop table info");
System.out.println("Table deleted in given Database...");   	  
}
catch(SQLException e){
System.out.print(e);
} 
}
}

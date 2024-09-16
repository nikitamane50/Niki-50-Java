import java.sql.*;
public class UpdateTable
{
public static void main(String args[]){
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql:///Student","root","root"); 
Statement st=con.createStatement();
st.executeUpdate("update info set Name='Sakshi' where Address='Satara'");
st.executeQuery("select * from info");
ResultSet rs=st.getResultSet();
while(rs.next()){
System.out.println(rset.getString(1)+"  "+rset.getString(2)+"  "+rset.getString(3));
}
}
catch(ClassNotFoundException e){
System.out.println(e); 
}
catch(SQLException e){ 
System.out.println(e);
}
}
}
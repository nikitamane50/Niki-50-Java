import java.sql.*;
public class CreateTable{
public static void main(String args[]){
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql:///Student","root","root");
Statement st=con.createStatement();
st.execute("create table info(Name varchar(20),ID integer,Address varchar(50))");
st.execute("insert into info values('Nikita','101','Mumbai')"); 
st.execute("insert into info values('Rasika','102','Satara')"); 
st.execute("select * from info");
ResultSet rs=st.getResultSet(); 
while(rs.next()){
System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
}
}
catch(ClassNotFoundException e){System.out.println(e);} 
catch(SQLException e){System.out.println(e); }
}
}
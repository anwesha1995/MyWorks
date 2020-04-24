import java.sql.*;


public class DbConnect {

	public static void main(String[] args) throws Exception {

		String dbname="javatest";
		String url="jdbc:mysql://localhost:3306/"+dbname;
		String uname="root";
		String pass="root";
		String query="select * from employee";
		Class.forName("com.mysql.cj.jdbc.Driver");	
		Connection con=DriverManager.getConnection(url, uname, pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getDouble(3));  
		
		st.close();
		con.close();
		

	}

}

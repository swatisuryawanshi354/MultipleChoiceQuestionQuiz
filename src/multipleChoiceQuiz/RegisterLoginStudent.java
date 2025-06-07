package multipleChoiceQuiz;

import java.security.DomainCombiner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegisterLoginStudent {
public static  void registerStudent(String first_name,String last_name,String email,String password) {
	String query1="insert into students(first_name,last_name,email,password)values(?,?,?,?)";
	try (Connection con=DBConnection.getConnection();
		PreparedStatement pre=con.prepareStatement(query1)){
		pre.setString(1, first_name);
		pre.setString(2, last_name);
		pre.setString(3, email);
		pre.setString(4, password);
		
		pre.executeUpdate();
		
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
		
	}
 
	
}
public static int login(String email,String password) {
	String sql="select id from students where email=? AND password=?";
	try(Connection con=DBConnection.getConnection();
			PreparedStatement pre=con.prepareStatement(sql)){
		pre.setString(1, email);
		pre.setString(2, password);
		ResultSet r=pre.executeQuery();
		if(r.next()) {
			return r.getInt("id");
		}else
		{System.out.println("invalid input");
		return -1;
		}
	}
		
	
	catch(Exception e) {
		System.out.println(e.getMessage());
		return -1;
	}


}
}
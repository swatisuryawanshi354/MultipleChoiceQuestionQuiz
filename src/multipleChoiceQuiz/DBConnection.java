package multipleChoiceQuiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
static String url="jdbc:mysql://localhost:3306/multiple_choice_quiz_db";
static String user="root";
static String password="root";

public static Connection getConnection() throws SQLException {
	return DriverManager.getConnection(url,user,password);
}

}

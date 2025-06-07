package multipleChoiceQuiz;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class QuizScoreDisplay {
public static void main(String[] args) throws SQLException {
	Scanner sc=new Scanner(System.in);
	RegisterLoginStudent st=new RegisterLoginStudent();
	QuestionList ls=new QuestionList();
	
	System.out.println("welcome to quiz competiotion");
	
	System.out.println("Enter first_name");
	String first_name=sc.nextLine();
	System.out.println("Enter last_name");
	String last_name=sc.nextLine();
	System.out.println("Enter email");
	String email=sc.nextLine();
	System.out.println("Enter password");
	String password=sc.nextLine();
	
	int studentId=RegisterLoginStudent.login(email, password);


List<Question>questions=ls.getQuestions();
int score=ls.startQuiz(questions,sc);
ls.saveScore(studentId, score);
System.out.println("your score is "+score);
}
}
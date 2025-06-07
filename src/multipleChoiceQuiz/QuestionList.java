package multipleChoiceQuiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionList {

	public List<Question>getQuestions(){
		List<Question>questions=new ArrayList<>();
		String sql="select * from questions LIMIT 4";
		try(Connection con=DBConnection.getConnection();
		PreparedStatement pre=con.prepareStatement(sql);
				ResultSet r=pre.executeQuery()){
			while(r.next()) {
				Question qs=new Question(
						r.getInt("id"),r.getString("question"),
								r.getString("option_1"),
								r.getString("option_2"),
								r.getString("option_3"),
								r.getString("option_4"),
								r.getString("correct_option"));
						questions.add(qs);
						
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
				
		}
		return questions;
	}
	public int startQuiz(List<Question>questions,Scanner sc) {
		
		int score=0;
		for(Question q:questions) {
			System.out.println(q.getQuestion());
			System.out.println("1. "+q.getOption_1());
			System.out.println("2. "+q.getOption_2());
			System.out.println("3. "+q.getOption_3());
			System.out.println("4. "+q.getOption_4());
			System.out.println("Enter your answer");
			String answer=sc.nextLine();
			if(answer.equals(q.getCorrect_option())){
				score++;
			}
		}
		return score;
	}

public void saveScore(int studentId, int score) {
	String sql="insert into scores(student_id,score)values(?,?)";
	try(Connection con=DBConnection.getConnection();
			PreparedStatement pre=con.prepareStatement(sql)){
		pre.setInt(1, studentId);
		pre.setInt(2, score);
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}
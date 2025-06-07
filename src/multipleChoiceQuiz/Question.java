package multipleChoiceQuiz;

public class Question {
	private int id;
	private String question;
	private String option_1;
	private String option_2;
	private String option_3;
	private String option_4;
	private String correct_option;

	public Question(int id,String question,String option_1,String option_2,String option_3,String option_4,String correct_option) {
		this.id=id;
		this.question=question;
		this.option_1=option_1;
		this.option_2=option_2;
		this.option_3=option_3;
		this.correct_option=correct_option;
		
	}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getQuestion() {
	return question;
}

public void setQuestion(String question) {
	this.question = question;
}

public String getOption_1() {
	return option_1;
}

public void setOption_1(String option_1) {
	this.option_1 = option_1;
}

public String getOption_2() {
	return option_2;
}

public void setOption_2(String option_2) {
	this.option_2 = option_2;
}

public String getOption_3() {
	return option_3;
}

public void setOption_3(String option_3) {
	this.option_3 = option_3;
}

public String getOption_4() {
	return option_4;
}

public void setOption_4(String option_4) {
	this.option_4 = option_4;
}

public String getCorrect_option() {
	return correct_option;
}

public void setCorrect_option(String correct_option) {
	this.correct_option = correct_option;
}



}

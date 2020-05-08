package main;
import java.util.List;

public class Question {
	
	private String question;
	private List<String> options;
	private Integer correctOpt;
	
	
	public Integer getCorrectOpt() {
		return correctOpt;
	}

	public Question(String question, List<String> options, Integer correctOpt) {
		this.question = question;
		this.options = options;
		this.correctOpt = correctOpt;
	}


	public List<String> getOptions() {
		return options;
	}

	public String getQuestion() {
		return question;
	}
	
	



}

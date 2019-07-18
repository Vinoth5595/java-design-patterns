package structural.bridge;

import java.util.ArrayList;
import java.util.List;

public class PythonQuestions implements Question {
	private List<String> questions = new ArrayList<String>();
	private int current = 0;

	public PythonQuestions() {
		questions.add("What is python? ");
		questions.add("What is abstraction in python? ");
		questions.add("How multiple polymorphism is achieved in python? ");
		questions.add("How many types of exception  handling are there in python? ");
		questions.add("Define the keyword final for  variable, method, and class in python? ");
		questions.add("What is django? ");
		questions.add("What is multi-threading in python? ");
	}

	public void nextQuestion() {
		if (current <= questions.size() - 1)
			current++;
		System.out.print(current);
	}

	public void previousQuestion() {
		if (current > 0)
			current--;
	}

	public void newQuestion(String quest) {
		questions.add(quest);
	}

	public void deleteQuestion(String quest) {
		questions.remove(quest);
	}

	public void displayQuestion() {
		System.out.println(questions.get(current));
	}

	public void displayAllQuestions() {
		for (String quest : questions) {
			System.out.println(quest);
		}
	}
}

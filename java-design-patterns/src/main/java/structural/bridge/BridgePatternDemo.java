package structural.bridge;

public class BridgePatternDemo {

	public static void main(String[] args) {
		QuestionFormat questions = new QuestionFormat("Java/Python Programming Language");
		questions.q = new JavaQuestions();
		questions.displayAll();
		questions.q = new PythonQuestions();
		questions.displayAll();

	}

}

package behavioral.interpreter;

public class InterpreterDesignPatternDemo {

	public static void main(String[] args) {
		String infix = "a+b*c-d";

		Pattern ip = new InfixToPostfixPattern();

		String postfix = ip.conversion(infix);
		System.out.println("Infix:   " + infix);
		System.out.println("Postfix: " + postfix);
	}

}

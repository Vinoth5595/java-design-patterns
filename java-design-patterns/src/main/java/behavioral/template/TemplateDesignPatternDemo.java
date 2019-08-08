package behavioral.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TemplateDesignPatternDemo {

	public static void main(String[] args) {
		Game game = null;
		game = new Chess();
		game.play();
		System.out.println("*******************************************");
		game = new Soccer();
		game.play();
	}

}

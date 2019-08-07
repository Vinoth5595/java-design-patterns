package behavioral.mediator;

public class MediatorDesignPatternDemo {
	public static void main(String[] args) {
		ChatBot chatBot = new ChatBotImpl();
		User1 u1 = new User1(chatBot);
		User2 u2 = new User2(chatBot);
		u1.setname("John Doe");
		u2.setname("Jane Doe");

		u1.sendMsg("Hi Jane! how are you?");
		u2.sendMsg("I am Fine ! How are you?");
		u1.sendMsg("I am also Fine.");
	}
}

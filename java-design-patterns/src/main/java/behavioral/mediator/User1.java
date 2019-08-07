package behavioral.mediator;

public class User1 implements Participant {
	private String name;
	private ChatBot chatbot;

	@Override
	public void sendMsg(String msg) {
		chatbot.sendMessage(msg, this);
	}

	@Override
	public void setname(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	public User1(ChatBot chatBot) {
		this.chatbot = chatBot;
	}

}

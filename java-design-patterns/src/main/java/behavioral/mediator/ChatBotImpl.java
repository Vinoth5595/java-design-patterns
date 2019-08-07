package behavioral.mediator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ChatBotImpl implements ChatBot {

	@Override
	public String sendMessage(String msg, Participant p) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E dd/MM/yyyy hh:mm:ss a");
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("["+dateTimeFormatter.format(localDateTime)+"] "+p.getName()+"'s message: "+msg);  
		return null;
	}

}

package behavioral.momento;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class MomentoDesignPatternDemo {

	public static void main(String[] args) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E dd/MM/yyyy hh:mm:ss.SSSSSSSS a");
		List<Life.Memento> savedTimes = new ArrayList<>();
		Life life = new Life();

		// time travel and record the eras
		life.set(dateTimeFormatter.format(LocalDateTime.now()));
		savedTimes.add(life.saveToMemento());
		life.set(dateTimeFormatter.format(LocalDateTime.now()));
		savedTimes.add(life.saveToMemento());
		life.set(dateTimeFormatter.format(LocalDateTime.now()));
		savedTimes.add(life.saveToMemento());
		life.set(dateTimeFormatter.format(LocalDateTime.now()));

		life.restoreFromMemento(savedTimes.get(0));
	}

}

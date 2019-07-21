package structural.flyweight;

import java.util.HashMap;

public class PlayerFactory {
	private static HashMap<String, Player> hashmap = new HashMap<>();

	public static Player getPlayer(String player) {
		Player p = null;

		if (hashmap.containsKey(player))
			p = hashmap.get(player);
		else {
			switch (player) {
			case "Terrorist": {
				System.out.println("Terrorist Object Created");
				p = new Terrorist();
				break;
			}
			case "CounterTerrorist": {
				System.out.println("Counter Terrorist Object Created");
				p = new CounterTerrorist();
				break;
			}
			default:
				System.out.println("Invalid Choice!!!");
			}
			hashmap.put(player, p);
		}
		return p;
	}
}

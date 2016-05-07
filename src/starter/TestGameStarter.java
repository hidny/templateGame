package starter;

import dummyServer.MiniServer;
import euchre.EuchreServerMiddleMan;

public class TestGameStarter {

	public static void main(String[] args) {
		EuchreServerMiddleMan middleMan = new EuchreServerMiddleMan();
		MiniServer players[] = new MiniServer[4];
		players[0] = new MiniServer("Michael");
		players[1] = new MiniServer("Phil");
		players[2] = new MiniServer("Richard");
		players[3] = new MiniServer("Doris");
		
		
		middleMan.startGameForClients(players);

	}

}

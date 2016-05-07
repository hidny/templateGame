package dummyServer;

//TODO: punish someone if they spam / requests.

//Tuesday at hacklab:
//	1) Make more functions
//	2) get rid of immidiateResponse as an instance var.
// 3) Add chat so I can actually impress.

//TODO: way more functions!
//handle leaving in the middle of a game for later.
//(I want to add the ability to reconnect)
//Add ability to start holdem!
//keep going though code and adding functions.

public class MiniServer {

	private String name = null;
	
	public MiniServer(String name) {
		this.name = name;
	}
	
	
	public void sendMessageToClient(String msg) {
		if(getClientName().startsWith("Michael")) {
			System.out.println("To " + getClientName() + ": " + msg);
		}
	}
	
	public String getClientName() {
		return this.name;
	}
	
}

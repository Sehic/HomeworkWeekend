package ba.bitcamp.hajrudin.homework.weekend4;

import java.util.Arrays;

/**
 * Class football team with attributes:
 * name of football team
 * array of players from class player
 * @author Sehic
 *
 */
public class FootballTeam {
	private String name;
	private Player [] players;
	
	//Generating get and set methods
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Player[] getPlayers() {
		return players;
	}
	public void setPlayers(Player[] players) {
		this.players = players;
	}
    
	//Generating constructor
	
	public FootballTeam(String name, Player[] players) {
		super();
		this.name = name;
		this.players = players;
	}
	
	//Generating toString method for print

	@Override
	public String toString() {
		String s = "";
		s="Name of football team: "+name+"\n";
		for(int i =0; i<players.length;i++){
			s+=players[i];
		}
		return s;
	}
	
	
	
	
	
	
	
	
}

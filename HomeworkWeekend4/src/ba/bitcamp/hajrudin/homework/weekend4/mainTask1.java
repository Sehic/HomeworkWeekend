package ba.bitcamp.hajrudin.homework.weekend4;

import java.util.Arrays;

public class mainTask1 {

	public static void main(String[] args) {
		Player p1 = new Player("Edin Dzeko", 1985, "Striker");
		Player p2 = new Player("Miralem Pjanic", 1990, "Midfielder");
		Player p3 = new Player("Emir Spahic", 1985, "Defender");
		Player p4 = new Player("Asmir Begovic", 1987, "Goalkeeper");
		Player p5 = new Player("Muhamed Besic", 1991, "Midfilder");
		Player p6 = new Player("Edin Visca", 1986, "Striker");
		Player p7 = new Player("Haris Medunjanin", 1988, "Midfilder");
		Player p8 = new Player("Jasmin Fejzic", 1981, "Goalkeeper");
		Player p9 = new Player("Sead Kolasinac", 1989, "Defender");
		Player p10 = new Player("Vedad Ibisevic", 1985, "Striker");
		
		Player [] arrOfPlayers = new Player [5];
		arrOfPlayers[0]=p1;
		arrOfPlayers[1]=p2;
		arrOfPlayers[2]=p3;
		arrOfPlayers[3]=p4;
		arrOfPlayers[4]=p5;
		Player [] arrOfPlayers1 = new Player [5];
		arrOfPlayers1[0]=p6;
		arrOfPlayers1[1]=p7;
		arrOfPlayers1[2]=p8;
		arrOfPlayers1[3]=p9;
		arrOfPlayers1[4]=p10;
		FootballTeam t1 = new FootballTeam("Bosna", arrOfPlayers);
		FootballTeam t2 = new FootballTeam("Hercegovina", arrOfPlayers1);
		System.out.println("Count of players in team who was born that year "+countPlayers(t1, 1990));
		System.out.println("Count of players who plays in that position "+countPlayers(t2, "Striker"));
		System.out.println("Youngest player in team: \n"+getYoungestPlayer(t1).toString());
		
	}
	/**
	 * This method accounts how many players there are 
	 * in a given team was born that year 
	 * @param t is team form class footballteam
	 * @param year the parameter with which we compare the year of birth 
	 * @return method returns how many players was born that year
	 */
	public static int countPlayers(FootballTeam t, int year){
		int counter = 0;
		for(int i = 0; i<t.getPlayers().length; i++){
			if(t.getPlayers()[i].getYearOfBirth()==year){
				counter++;
			}
		}
		return counter;
	}
	
	/**
	 * This method calculates how many players there are in a given team 
	 * to play at a certain position
	 * @param t team from class footballteam
	 * @param position the parameter with witch we compare the position
	 * @return returns how many players play in that position
	 */
	public static int countPlayers(FootballTeam t, String position){
		int counter = 0;
		for(int i = 0; i<t.getPlayers().length;i++){
			if(t.getPlayers()[i].getPosition().equals(position)){
				counter++;
			}
		}
		return counter;
	}
	/**
	 * This method find youngest player in team from class FootballTeam
	 * @param t team from class FootballTeam
	 * @return returns youngest player
	 */
	public static Player getYoungestPlayer (FootballTeam t){
	Player p = new Player(t.getPlayers()[0].getName(), t.getPlayers()[0].getYearOfBirth(), t.getPlayers()[0].getPosition());
		for(int i = 0; i<t.getPlayers().length;i++){
			if(t.getPlayers()[i].getYearOfBirth()>p.getYearOfBirth()){
				p=t.getPlayers()[i];
			}
		}
		return p;
	}

}

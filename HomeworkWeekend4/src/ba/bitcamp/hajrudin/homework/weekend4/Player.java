package ba.bitcamp.hajrudin.homework.weekend4;
/**
 * Class Player with attributes:
 * name
 * year of birth
 * position
 * @author Sehic
 *
 */
public class Player {
	private String name;
	private Integer yearOfBirth;
	private String position;
	
	//Generating get and set methods
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(Integer yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	//Generating constructor method

	public Player(String name, Integer yearOfBirth, String position) {
		super();
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.position = position;
	}
	
	//Generating toString method for print
	@Override
	public String toString() {
		String s = "";
		s = "Name of player: "+name+"\n";
		s+="Year of birth: "+yearOfBirth+"\n";
		s+="Position: "+position+"\n";
		return s;
	}
	
	
	
	
}

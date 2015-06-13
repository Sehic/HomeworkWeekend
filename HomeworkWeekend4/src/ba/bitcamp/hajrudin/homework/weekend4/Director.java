package ba.bitcamp.hajrudin.homework.weekend4;

public class Director {
	private String directorsName;
	private Integer yearOfBirth;
	
	//Generating get and set methods
	public String getDirectorsName() {
		return directorsName;
	}
	public void setDirectorsName(String directorsName) {
		this.directorsName = directorsName;
	}
	public Integer getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(Integer yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	//Generating constructor
	public Director(String directorsName, Integer yearOfBirth) {
		super();
		this.directorsName = directorsName;
		this.yearOfBirth = yearOfBirth;
	}
	
	//Generating toString method for print
	@Override
	public String toString() {
		String s = "";
		s = "Directors name: "+directorsName+"\n";
		s+= "Year od birth: "+yearOfBirth;
		return s;
	}
	
	
}

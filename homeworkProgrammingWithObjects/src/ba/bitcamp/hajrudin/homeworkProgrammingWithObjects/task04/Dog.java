package ba.bitcamp.hajrudin.homeworkProgrammingWithObjects.task04;

public class Dog extends Pet{
	private String breed;

	public Dog(String name, int year,String breed) {
		super(name, year, Pet.DOG);
		this.breed = breed;
	}
	
	public String toString(){
		return super.toString();
	}
	
}

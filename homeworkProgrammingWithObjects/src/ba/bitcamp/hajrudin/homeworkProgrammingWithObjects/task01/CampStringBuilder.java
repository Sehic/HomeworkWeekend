package ba.bitcamp.hajrudin.homeworkProgrammingWithObjects.task01;

import java.util.Arrays;

public class CampStringBuilder {
	private char [] characters;
	
	public CampStringBuilder(char[] characters) {
		super();
		this.characters = characters;
	}

	public void append(Object o){
		System.out.println(this.toString()+o.toString());
	}
	
	public void prepend(Object o){
		System.out.println(o.toString()+this.toString());
	}
	
	@Override
	public String toString() {
		String s = "";
		for(int i = 0; i<characters.length; i++){
			s+=characters[i]+" ";
		}
		return s;
	}
	
	
}

package ba.bitcamp.hajrudin.homeworkProgrammingWithObjects.task02;

public class Autor {
	private String name;
	private String email;
	private String gender;
	
	public Autor(String name, String email, String gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		String s = "";
		s = "Autor name: "+name+"\n";
		s+= "Email: "+email+"\n";
		s+="Gender: "+gender+"\n";
		return s;
	}
	
	
	
}

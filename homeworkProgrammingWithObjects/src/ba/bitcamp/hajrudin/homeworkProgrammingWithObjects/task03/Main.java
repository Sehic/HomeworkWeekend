package ba.bitcamp.hajrudin.homeworkProgrammingWithObjects.task03;

public class Main {

	public static void main(String[] args) {
		Date d = new Date(31,12,2014);
		System.out.println(d.toString());
		d.dayPassed();
		System.out.println(d.toString());
		d.mounthPassed();
		System.out.println(d.toString());
		try{
		d.setDay(33);
		}catch(Exception e){
			System.out.println("Wrong input!");
		}

	}

}

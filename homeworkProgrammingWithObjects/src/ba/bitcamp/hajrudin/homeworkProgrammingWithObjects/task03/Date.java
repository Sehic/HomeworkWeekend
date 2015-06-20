package ba.bitcamp.hajrudin.homeworkProgrammingWithObjects.task03;

public class Date {
	private int day;
	private int mounth;
	private int year;
	
	public Date(int day) {
		super();
		this.day = day;
		this.mounth = 1;
		this.year = 1;
	}
	
	public Date(int day, int mounth){
		super();
		this.day=day;
		this.mounth=mounth;
		this.mounth=1;
	}
	
	public Date(int day, int mounth, int year){
		super();
		this.day = day;
		this.mounth = mounth;
		this.year=year;
	}
	
	public void setDay(int day) throws Exception{
		if(day<0 || day>31){
			throw new Exception();
		} else{
			this.day=day;
		}
	}
	
	public void setMounth(int mounth) throws Exception{
		if(mounth<0 || mounth>12){
			throw new Exception();
		} else {
			this.mounth=mounth;
		}
	}
	
	public void setYear(int year){
		this.year=year;
	}
	
	public void dayPassed(){
		if(this.day==30){
			switch(this.mounth){
			case 4:
			case 6:
			case 9:
			case 11:
				this.mounth+=1;
				this.day=1;
				break;
			default:
				this.day+=1;
				break;
			}
		} else if(this.day==31){
			switch(this.mounth){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
				this.mounth+=1;
				this.day=1;
				break;
			case 12:
				this.mounth=1;
				this.year+=1;
				this.day=1;
				break;
			default:
				this.day+=1;
				break;
			}
		} else if(this.day == 28 && this.mounth==2){
			this.mounth+=1;
			this.day=1;
		} else {
			this.day+=1;
		}
	}
	
	public void mounthPassed(){
		if(this.mounth==12){
			this.mounth=1;
			this.year+=1;
		}else{
			this.mounth+=1;
		}
	}
	
	@Override
	public String toString(){
		String s = "";
		if(day<10){
			s+="0"+Integer.toString(day)+".";
		}else {
			s+=Integer.toString(day)+".";
		} if(mounth<10){
			s+="0"+Integer.toString(mounth)+".";
		}else {
			s+=Integer.toString(mounth)+".";
		} s+=Integer.toString(year)+"\n";
		return s;
	}
	
	
}

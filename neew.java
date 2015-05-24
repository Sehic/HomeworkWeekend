

public class neew {
    public static void main(String[] args) {

    int hour;
    int minute;
    int second;
    long totalMilliSeconds=System.currentTimeMillis();
    long totalSeconds=totalMilliSeconds/1000;
    second=(int)(totalSeconds%60);
    long totalMinutes=totalSeconds/60;
    minute=(int)(totalMinutes%60);
    long totalHours=totalMinutes/60;
    hour=(int)(totalHours%24);
    hour+=2;
    if(hour>=6 && hour<10){
    System.out.println("Morning!! Time:"+hour+":"+minute+":"+second);
    }
    else if(hour>=10 && hour<18){
        System.out.println("Day!! Time:"+hour+":"+minute+":"+second);
        }
    else if(hour>=18 && hour<22){
        System.out.println("Evening!! Time:"+hour+":"+minute+":"+second);
        }
    else if(hour>=22){
        System.out.println("Night!! Time:"+hour+":"+minute+":"+second);
        }
    else if(hour>=0 && hour<6){
        System.out.println("Night!! Time:"+hour+":"+minute+":"+second);
        }
    }
 
 
}

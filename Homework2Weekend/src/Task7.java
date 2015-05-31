import java.util.Scanner;


public class Task7 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj materije");
		int materija = ulaz.nextInt();
		System.out.println("Unesite broj kontenjera");
		int K = ulaz.nextInt();
		int brojK = 0;
		
		if(materija%2!=0){
			materija++;
			brojK++;
		}
			int pomocna=materija;
			while(pomocna%2==0){
			pomocna/=2;
			if(pomocna==K){
				break;
			}
			else if(pomocna%2!=0){
				pomocna=materija++;
				brojK++;
			}		
			
			}
			if(brojK!=0)
			System.out.printf("Potrebno je kupiti %d kontenjera",brojK);
			else
			System.out.println("Mujo ne kupuj");
			
			
			

	}

}

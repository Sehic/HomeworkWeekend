import java.util.Scanner;


public class Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number:");
		int N = input.nextInt();
		firstMethod(N);
		nuberOfDigits(N);
		System.out.println(replaceFirstAndLastDigit(N));
		numbersBetweenNAndQ(N);
		
	}
	
	public static void firstMethod(int N){
		String s = String.valueOf(N);
		String newS = "";
		int counter = 0;
		if(s.length()<3){
			System.out.println(s);
		} else {
				for(int i = s.length()-1; i>=0;i--){
					char c = s.charAt(i);
					if(counter == 3){
					newS=c+","+newS;
					counter = 1;
					}
					else {
						newS=c+newS;
						counter++;
					}
				}
			
		System.out.println(newS);
		}}
	
	public static void nuberOfDigits(int N){
		int counter=0;
		int temp = N;
		while(temp>0){
			temp/=10;
			counter++;
		}
		System.out.println("Number "+N+" has "+counter+" digits.");
	}
	
	public static int replaceFirstAndLastDigit(int N){
		int Q = 0;
		String s = String.valueOf(N);
		String newS = "";
		if(N<10){
			return N;
		} else {
			char c = s.charAt(s.length()-1);
			newS+=c;
			for(int i = 1; i<s.length()-1;i++){
				c=s.charAt(i);
					newS+=c;
			}
			c=s.charAt(0);
			newS+=c;
			Q = Integer.parseInt(newS);
			return Q;
		}
	}
	
	public static void numbersBetweenNAndQ(int N){
		int Q = replaceFirstAndLastDigit(N);
		int counter = 0;
		if(N<Q){
			for(int i = N+1; i<Q; i++){
				counter++;
			}
			if(counter%2==0){
				for(int i = N+1; i<Q; i++){
					if(i%2==0){
						System.out.print(i+" ");
					}
				}
			}
			else{
				for(int i = N+1; i<Q; i++){
					if(i%2!=0){
						System.out.print(i+" ");
					}
				}
			}
		}
			else if(Q<N){
				for(int i = Q+1; i<N; i++){
					counter++;
				}
				if(counter%2==0){
					for(int i = Q+1; i<N; i++){
						if(i%2==0){
							System.out.print(i+" ");
						}
					}
				}
				else{
					for(int i = Q+1; i<N; i++){
						if(i%2!=0){
							System.out.print(i+" ");
						}
					}
				}
				}
				else {
					System.out.println("No numbers between N and Q");
			}
		System.out.println();
		}
		
	}
			
	


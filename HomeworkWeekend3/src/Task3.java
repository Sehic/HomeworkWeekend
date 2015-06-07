import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string one:");
		String s1 = input.nextLine();
		System.out.println("Enter string two:");
		String s2 = input.nextLine();
		firstMethod(s1, s2);
		System.out.println(secondMethod(s1, s2));
		alphabet(s1, s2);
		anagram(s1, s2);
	}

	public static void firstMethod(String s1, String s2) {
		String s3 = "";
		int a = 0;
		if (s1.length() > s2.length()) {
			a = s2.length();
		} else {
			a = s1.length();
		}
		for (int i = 0; i < a; i++) {
			char c = s1.charAt(i);
			char c1 = s2.charAt(i);
			s3 += c;
			s3 += c1;
		}
		int b = 0;
		int temp = -1;
		if (s1.length() > s2.length()) {
			b = s1.length();
			temp = 0;
		} else {
			b = s2.length();
		}
		for (int i = a; i < b; i++) {
			if (temp == 0) {
				char c = s1.charAt(i);
				s3 += c;
			} else {
				char c = s2.charAt(i);
				s3 += c;
			}

		}
		System.out.println(s3);
	}

	public static boolean secondMethod(String s1, String s2) {
		int counter = 0;
		if (s1.length() > s2.length()) {
			return false;
		} else {
			s1 = s1.toLowerCase();
			s2 = s2.toLowerCase();
			for (int i = 0; i < s1.length(); i++) {
				for (int j = 0; j < s2.length(); j++) {
					if (s1.charAt(i) == s2.charAt(j)) {
						counter++;

					}
				}
			}
		}
		if (counter >= s1.length()) {
			return true;
		} else {
			return false;
		}
	}

	public static void alphabet(String s1, String s2) {
		int a = s1.compareTo(s2);
		if (a < 0) {
			System.out.println(s2);
		} else {
			System.out.println(s1);
		}
	}

	public static void anagram(String s1, String s2) {
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		char [] c1 = s1.toCharArray();
		char [] c2 = s2.toCharArray();
		int temp = 0;
		int temp1 = 0;
		for(int i = 0; i<c1.length; i++){
			temp+=c1[i];
		}
		for(int i = 0; i<c2.length; i++){
			temp+=c2[i];
		}
		if(temp==temp1){
			System.out.println("Stringovi su anagrami.");
		} else {
			System.out.println("Stringovi nisu anagrami.");
		}
		
	}

}

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter lenght of array 1:");
		int N = input.nextInt();
		System.out.println("Enter lenght of array 2:");
		int M = input.nextInt();
		int[] arr1 = new int[N];
		int[] arr2 = new int[M];
		for (int i = 0; i < N; i++) {
			System.out.println("Enter number for array 1 index " + i);
			arr1[i] = input.nextInt();
		}
		for (int i = 0; i < M; i++) {
			System.out.println("Enter number for array 2 index " + i);
			arr2[i] = input.nextInt();
		}
		System.out.println(isEqualsArrays(arr1, arr2));
		System.out.println(Arrays.toString(sumOfTwoArr(arr1, arr2)));
		System.out.println(Arrays.toString(twoArrInOne(arr1, arr2)));

	}

	public static boolean isEqualsArrays(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length) {
			return false;
		} else {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					return false;
				}
			}
			return true;
		}
	}

	public static int[] sumOfTwoArr(int[] arr1, int[] arr2) {
		int[] temp;
		if (arr1.length < arr2.length) {
			temp = new int[arr2.length];
			for (int i = 0; i < arr1.length; i++) {
				temp[i] = arr1[i];
			}
			String s1 = "";
			String s2 = "";
			for (int i = 0; i < temp.length; i++) {
				s1 += temp[i];
				s2 += arr2[i];
			}
			int a = Integer.parseInt(s1);
			int b = Integer.parseInt(s2);
			int c = a + b;
			String s3 = "";
			s3 += s3.valueOf(c);
			int[] sum = new int[s3.length()];
			for (int i = 0; i < s3.length(); i++) {
				sum[i] = s3.charAt(i) - 48;
			}
			return sum;
		}

		else if (arr1.length > arr2.length) {
			temp = new int[arr1.length];
			for (int i = 0; i < arr2.length; i++) {
				temp[i] = arr2[i];
			}
			String s1 = "";
			String s2 = "";
			for (int i = 0; i < temp.length; i++) {
				s1 += temp[i];
				s2 += arr1[i];
			}
			int a = Integer.parseInt(s1);
			int b = Integer.parseInt(s2);
			int c = a + b;
			String s3 = "";
			s3 += s3.valueOf(c);
			int[] sum = new int[s3.length()];
			for (int i = 0; i < s3.length(); i++) {
				sum[i] = s3.charAt(i) - 48;
			}
			return sum;
		}

		else if (arr1.length == arr2.length) {
			String s1 = "";
			String s2 = "";
			for (int i = 0; i < arr1.length; i++) {
				s1 += arr1[i];
				s2 += arr2[i];
			}
			int a = Integer.parseInt(s1);
			int b = Integer.parseInt(s2);
			int c = a + b;
			String s3 = "";
			s3 += s3.valueOf(c);
			int[] sum = new int[s3.length()];
			for (int i = 0; i < s3.length(); i++) {
				sum[i] = s3.charAt(i) - 48;
			}
			return sum;
		}
		return null;

	}

	public static int[] twoArrInOne(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		int counter = 0;
		for (int i = arr1.length; i < arr3.length; i++) {
			arr3[i] = arr2[counter];
			counter++;
		}
		return arr3;
	}

}

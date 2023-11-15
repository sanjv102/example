package example;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the numbers.");
		
		int a= in.nextInt();
		int b=in.nextInt();
		
		int result=a+b;
		
		System.out.println("Addition:- "+result);

	}

}

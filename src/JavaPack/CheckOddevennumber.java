package JavaPack;

import java.util.Scanner;

public class CheckOddevennumber {

	public static void main(String[] args) {
		
		int x;
		
		System.out.print("Enter your number");
		
		Scanner s1 =new Scanner(System.in);
		
		x = s1.nextInt();
		
		if (x % 2 == 0) {
			
			System.out.println("Your number is Even");
		}
		else {
			
			System.out.println("your number is odd");
		}
		

	}

}

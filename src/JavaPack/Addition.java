package JavaPack;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		
		int x,y,sum;
		
		System.out.print("Enter x and y ");
		
		Scanner s1 = new Scanner(System.in);
		
		x=s1.nextInt();
		
		y=s1.nextInt();
		
		sum=x+y;
		
		System.out.print("Additon of two numbers ="+sum);
	
	}

}

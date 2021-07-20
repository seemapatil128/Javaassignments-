package JavaPack;

import java.util.Scanner;

public class Swapnumwithoutvar {

	public static void main(String[] args) {
		
		int x,y;
		
		System.out.print("Enter x and y =");
		
		Scanner s1 = new Scanner(System.in);
		
		x=s1.nextInt();
		
		y=s1.nextInt();
		
		System.out.println("Before swapping x="+x+"y="+y);
		
		x=x+y;
		
		y=x-y;
		
		x=x-y;
		
		System.out.print("After swapping x="+x+"y="+y);
				

	}

}

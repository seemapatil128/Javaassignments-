package JavaPack;

import java.util.Scanner;

public class Findlagrestnumber {

	public static void main(String[] args) {
		int x,y,z;
		System.out.println("Enter three integers");
		
		Scanner s1 =new Scanner(System.in);
		
		x=s1.nextInt();
		
		y=s1.nextInt();
		
		z=s1.nextInt();
		
		if ( x > y && x > z)
			System.out.println("X is largest number");
		else if ( y > x && y > z)
			
			System.out.println("y is largest number");
		else if ( z > x && z > y)
			
			System.out.println(" z is largest number");
		else 
			System.out.println("number are same ");
	}

}

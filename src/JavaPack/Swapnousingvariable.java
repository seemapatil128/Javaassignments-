package JavaPack;

import java.util.Scanner;

public class Swapnousingvariable {

	public static void main(String[] args) {

		int x, y, temp;

		System.out.print("Enter x and y ");

		Scanner s1 = new Scanner(System.in);

		x = s1.nextInt();

		y = s1.nextInt();

		System.out.println("Before swapping \nx=" + x + "\ny=" + y);

		temp = x;

		x = y;

		y = temp;

		System.out.print("After swapping \nx=" + x + "\ny=" + y);
	    

	}

}

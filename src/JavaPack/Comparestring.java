package JavaPack;

import java.util.Scanner;

public class Comparestring {

	public static void main(String[] args) {
		
		String s1,s2;
		
		System.out.println("Enter your first string");
		Scanner in =new Scanner(System.in);
		
		s1 = in.nextLine();
		
		System.out.println("enter your second string");
		s2= in.nextLine();
		
		if(s1.compareTo(s2) > 0 )
			System.out.println("Your first string is greater than second string");
		else if(s1.compareTo(s2 )< 0)
			System.out.println("Your first string is smaller than second string");
		else
			System.out.println("strings are equal");
		
	}

}

package JavaPack;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {

		int num = 0,rev=0;
		while(num!=0) {
			
			rev=rev*10+num%10;
			num=num/10;
			
		}
		System.out.println("Your reserver number is   "+rev);
		

	}

}

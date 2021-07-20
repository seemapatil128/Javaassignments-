package JavaPack;

import java.util.Scanner;

public class Scannerusing {

	public static void main(String[] args) {
		// take number to use scanner 
		int n1,n2,n3,i;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter your number n1");
		n1=s1.nextInt();
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter your number n2");
		n2=s2.nextInt();
		System.out.print(n1+" "+n2);
		for(i=1;i<20;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
		}
							
	}

}

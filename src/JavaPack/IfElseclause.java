package JavaPack;

import java.util.Scanner;

public class IfElseclause {

	public static void main(String[] args) {
		int passingmarks=40 ,obtainmarks;
		
		System.out.println("Enter your Marks");
		
		Scanner s1 = new Scanner(System.in);
		
		obtainmarks = s1.nextInt();
		
		if (obtainmarks >=passingmarks) {
						
			System.out.println("You are passed the Exam and your mareks is ="+obtainmarks);
			
		}
		else {
			
			System.out.println("You are Failed the Exam and your mareks is ="+obtainmarks );
			
		}
				

	}

}

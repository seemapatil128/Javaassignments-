package JavaPack;

import java.util.Scanner;

public class NestedIfElseclause {

	public static void main(String[] args) {
		
	    int passingmarks=40,obtainmarks;
	    char grade;
	    
	    System.out.println("Enter your Marks ");
	    	  	    
	    Scanner s1 = new Scanner(System.in);
	    
	    obtainmarks = s1.nextInt();
	    
	    if(obtainmarks >= passingmarks) {
	    	if (obtainmarks >= 90) 
	    		grade='A';
	    	else if (obtainmarks >= 75)
	    		 grade='B';
	    	else if (obtainmarks >= 50)
	    		grade='c';
	    		else 
	    			grade='d';    		 
	    	System.out.println("You Pass the Exam and your grade is  "+grade);
	    }
	    else {
	    	grade='F';
	    System.out.println("You Fail the Exam and your grade is  "+grade);
	    
	}

 }
}
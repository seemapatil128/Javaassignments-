//How 
package JavaPack;

import java.util.Scanner;

public class FahretoClesius {

	public static void main(String[] args) {
		
		float temp;
		
		System.out.print("Enter temp in Fahernite=");
		
		Scanner in = new Scanner(System.in);
		
		temp=in.nextInt();
		
		temp=((temp-32)*5)/9;
		
		System.out.println("Temp in Celsius is "+temp);
			

	}

}

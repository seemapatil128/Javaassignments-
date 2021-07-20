package JavaPack;

public class StringLenghtcalucalte {
	public static void main(String[] args) {
		String s="Hella Seema how are you";
		
		String nospacestring= s.replaceAll("\\s","");
		
		System.out.println(nospacestring);
		
		int lenghtofnospace=nospacestring.length();
		
		System.out.println(lenghtofnospace);
		
				
		
	}

}

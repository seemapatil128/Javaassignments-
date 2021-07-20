package JavaPack;

public class Test4 {

	public static void main(String[] args) {
		String arr1[]= new String[3];
		String arr2[]= new String[3];
		
		arr1[0]="A";
		arr1[1]="B";
		arr1[2]="C";
		
		arr2[0]="1";
		arr2[1]="2";
		arr2[2]="3";
		printA(arr2);
		printA(arr1);
		
	}

	public static void printA(String str[]) {
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}
	
}

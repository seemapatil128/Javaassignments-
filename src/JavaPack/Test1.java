package JavaPack;

public class Test1 {

	public static void main(String[] args) {
		int x=0;
		while(true) {
			x=increment(x);
			System.out.println("value of x is --"+x);
			if(x>10)
				break;
		}

	}
 public static int increment(int i)
 {
	 return i+1;
 }
}

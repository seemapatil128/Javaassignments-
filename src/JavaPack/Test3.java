package JavaPack;

public class Test3 {
	public static void main(String[] args) {
		int i=2;
		while(make(i))
		{
			i=i*i;
			System.out.println(i);
		}
		
	}
 public static boolean make(int i)
 {
	 if(i%3 != 0)
	 {
		 return true;
	 }else 
	 {
		 return false;
	 }
 }
}

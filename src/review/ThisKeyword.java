package review;

public class ThisKeyword {
 int a = 10; // global level variable 
	
	
	public static void main(String[] args) {
		int a =15; //local to main method
		System.out.println(a);
		test();
		
		
	}

	
	public static void test() {
		
		int a = 20; // local to this method
		System.out.println(a);
	}
}

package abstraction;
//just adding to test
public class A extends Y{

	public static void main(String[] args) {
		Y.test();
		

	}

	public void hello(){
		System.out.println("telling hello() what to do from class A");
	};
	
	public int sum(int a, int b) {
		return (a+a+b);
	};
}

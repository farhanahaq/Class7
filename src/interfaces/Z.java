package interfaces;

public interface Z {

	public abstract void abc();
	
	public abstract void mno();
	
	default void greetings() {
		System.out.println("hi");
		}
	default void easter() {
		System.out.println("today is easter");
		}
	
	public static void nmk() {
		
	}
	
	
	
}

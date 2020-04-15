package collection;

/* Array is fixed once declared. Can't change the size of it - it is called the restriction of array.
 * that is why list was created. 
 
 */
public class LearnArray {

	public static void main(String[] args) {

//two ways to define array
		
		//Method 1:
		//String[] names = {"John", "Steve", "Jane"};
		
		//Method 2: 
		int[] numbers = new int[5];
		numbers[0] = 55;
		numbers[1] = 65;
		numbers[2] = 75;
		numbers[3] = 85;
		numbers[4] = 95;
		//System.out.println(numbers[3]);
		
//Restriction of Array: they are fixed
		
		numbers = new int[6];
		numbers[5] = 105;
		System.out.println(numbers[3]);
		
		
		
		
		

		

	}

}

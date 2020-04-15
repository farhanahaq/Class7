package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*SET: Can't have any duplicate. 
SET 3 types - Hashset(random), LinkedHashSet(Given order), Treeset(sorted)
SET-HashSet does not have a way to print by index number because it is all random so no indexing
LinkedHashSet: its in order you add them
TreeSet: in alphabetical order
when we have to capture only capture unique data we need to use set not list. say AC number and it appears many
time but we need it only one then use set. 
*/

public class Sets {

	public static void main(String[] args) {
		
		Set<String> sh = new HashSet<String>();
		//sh.add("AP");
		
		sh.add("AP");
		sh.add("John");
		sh.add("Jane");
		sh.add("Tom");
		sh.add("Tim");
		sh.add("Levi");
		sh.add("AP");
		System.out.println(sh);
		
		for(String X:sh) {
			System.out.println(X);
		}
		
		Object[] myArray = sh.toArray(); //converting set to array by using class Object which is superclass and can implement all methods of array and other objects
		System.out.println(myArray[0]); //prining before sorting 
		Arrays.sort(myArray);
		System.out.println(myArray[0]);//prinint after sorting
		
		
		//LinkedHashSet
		System.out.println("=======================================");
		Set<String> lsh = new LinkedHashSet<String>();
		
		lsh.add("AP");
		lsh.add("John");
		lsh.add("Jane");
		lsh.add("Tom");
		lsh.add("Tim");
		lsh.add("Levi");
		lsh.add("AP");
		System.out.println(lsh);
		
		
		System.out.println("=======================================");
		Set<String> ts = new TreeSet<String>();
		
		ts.add("AP");
		ts.add("John");
		ts.add("Jane");
		ts.add("Tom");
		ts.add("Tim");
		ts.add("Levi");
		ts.add("AP");
		System.out.println(ts);
		
		

	}

}

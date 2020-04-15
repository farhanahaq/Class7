package collection;

/*List - we can add item later even after declaring it. so it is DYNAMIC. duplicate allowed. 

There are two kind of list 1. ArrayList 2. LinkedList.

Anything goes inside <> this have to be reference/object data type meaning non primitive
even tho intger is primitive but we can use it as Integer 
which is non primitive which is object type int
Integer = object type int
object type version of primitive data in <>

DIff between ArrayList and LinkedList? LinkedList does not suffle up when one item is removed. It only changes
the pointer. But ArrayList suffles list. So in case of add or remove, LinkedList take less time to compile so
LinkedList is more efficient. 

When we have less dataset it doesn't matter but when we have millions of dataset, then LinkedList is better.

IQ: Did you work with Java collection? Yes, i worked with Array, ArrayList, Maps and Sets
IQ: what is diff between Array and List? Array is fixed but List is Dynamic. Again between ArrayList and LinkedList, 
LinkedList is faster.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		
		//LIST:ArrayList and LinkedLIst
		
		List<String> AL = new ArrayList<String>(); //arraylist
		
		AL.add("AP");
		AL.add("John");
		AL.add("Jane");
		AL.add("Tom");
		AL.add("Tim");
		AL.add("AP");
		for(String i : AL) {
			System.out.println(i);
		}
		//System.out.println(AL.get(0));	
		
		AL.add("Farhana");
		//System.out.println(AL.get(0));
		System.out.println(AL.size()); //length is 7 but index starts at 0 
		System.out.println((AL.size())-1); //index goes upto 6
		System.out.println(AL.get(AL.size()-1));
		System.out.println(AL);
		
		List<String> LL = new LinkedList<String>(); //linkedlist	
		LinkedList<Character> newchar = new LinkedList<Character>();
		
		
		System.out.println("***********LINKEDLIST**********");
		LL.add("AP");
		LL.add("John");
		LL.add("Jane");
		LL.add("Tom");
		LL.add("Tim");
		LL.add("Levi");
		System.out.println(LL.get(0));	
		
		for(int i =0; i<LL.size(); i++) {
			System.out.println(LL.get(i));
		}
		
		//adding all array elements to make it one word APJohnJaneTomTimLevi
		String test = "";
		
		for(int j=0; j<LL.size(); j++) {
			test=test+LL.get(j);
		}
		System.out.println(test);
		
		LL.add("Farhana");
		System.out.println(LL.get(0));
		System.out.println(LL.size()); //length is 7 but index starts at 0 
		//System.out.println(AL.size()-1); index goes upto 6
		System.out.println(LL.get(AL.size()-1));
		System.out.println(LL);
		

		
		ArrayList<Integer> ALint = new ArrayList<Integer>();
		ArrayList<Character> ALchar = new ArrayList<Character>();
		ArrayList<Double> ALdbl = new ArrayList<Double>();
		ArrayList<Boolean> ALbool = new ArrayList<Boolean>();
		
	
	}


	
}

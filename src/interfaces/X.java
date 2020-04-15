package interfaces;

//public class X extends Y{
public class X implements Z, Z1{
/* The key word is <interface> to make it a interface <public interface Z>.
 We have to select Interface in place of Class from the Menu when we create a new class under a package.
 
 We CANNOT use word extends for interface. Instead we use word <implement>.
 
 interface can have ONLY Abstract methods so no body, non-static method. interface CANNOT have non-Abstract method. 
 
 we have to use word <implements> to inherit an interface.
 
When inheriting one interface to another interface we HAVE to use word <extends> NOT <implements> just like between
two Classes.

When inheriting interface from a Class both Abstract or non-Abstract, we use word implement CANNOT use extends.  

we CANNOT inherit a Class from an interface.

For interface, when inheriting from a Class, we can implement more than 1 interface and can do multiple interface. 
But for Class, when inheriting we can only implement one class from another class. 

IQ: what is the diff between interface and Abstarct class? Ans: see just above this line. ^

In Java version 8, they allowed interface to have body. check by java -version in cmd

interface will have body so for ALL access modifier EXCEPT protected. 
default void greetings(){(something something );} or public/private/abstract/static.
When calling this default method from a Class after inheriting, we DONT have to implement it by creating a same
method in Class since it is already implemented so we just call it by creating an Object and method name like this
obj.greetings(); So we can use the method from the interface or we can create our own to tell the method to do
something else. we can have more than one default methods in interface. 

 */
	public static void main(String[] args) {
//creating object of X class to inherit methods from Abstract Class Y		
		X obj = new X();
		obj.mno();
		obj.abc();
		obj.greetings();
		
	}

	public  void abc() {
	System.out.println("from X class abc");	
	}
	
	public void mno(){
		System.out.println("from X class mno");
	}
	
	//public void greetings() {
		//System.out.println("my own hi");
		
	}
	

	
	

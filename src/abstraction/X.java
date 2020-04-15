package abstraction;

/*ABSTRACT LECTTURE:

Abstract Class: put the word 'abstract' after public in the class, it will make it an abstract class.
==>public abstract class Y

abstract Method: put the word 'abstract' in declaring the method. abstract method do not have any body meaning
it is not implemented (no {}). 

Abstract class and method can not be static. it is always NON-STATIC.
==>public abstract void hello(); 

Main method can be abstract as it is always STATIC.

Non-Abstract Class can't have  Abstract Method but Abstract Class can have non-Abstract method.

Abstract class inherits abstract class no issue. 

Non-Abstract class can inherits Abstarct class if Abstarct class doesn't have abstract methods in it.

BUT when that Abstract class have Abstract methods, then inheritance from a non-Abstract class is problem. 
we have to create a non-Abstract method by the same name and give a body inside the non-Abstract class meaninf
we have to implement it meaning add {} to the method whether it has something inside or not. 

IQ if i am a non-abstract class and trying to inherit an abstract class that has abstract methods, what are some challenges and overcome? 
answer: I had to create method with same name and non-Abstract method and provide body braces {} in the non-Abstract class.

We CANNOT create an object for an Abstract class.  

why do we do it?
There can be an abstarct method in an abstract class, one user can inherit it and tell it what to do.
somebody else from a diff class can also inherit it and define it as he wants. we dont want to give them
the code but just the name of the Abstarct method and user can use it however they want. So basically we
are hiding our code from them and telling them that it is there and you can use it as u want.  

IQ: ask you how can I do 100% abstraction.
Ans: Interface. it is the way to do 100% abstraction. abstract class can have both abstract and non-abstract method
so it can NOT have 100% abstraction.

Interfaces makes it 100% abstraction as it can't have any method with body. whatever goes in Interfaces, never
has a body. Z is Interfaces and there is no body. 

you can implements from Interfaces but not extends to Abstract class.

IQ: which java version are you using?
Ans: java version 8

what is the diff between inheritance and implementations?
ans: more than one class in implementation

we can add body to a method in interfaces with word default but public will not work after version 8 java. 

you still cant have a default body in interface even after version 8 java.

for inheritance purpose, you can 
extend from <one interface to another> but 
can't extents from <interface to non-abstract class> but 
you can implement from <interface to non-abstract class>


*/

public class X extends Y{

	public static void main(String[] args) {
		
	X obj = new X();
	
	obj.hello();
		
	}//end of main

	// Calling abstract method hello() from parent Y but wihtout word abstract and telling it to do something
	public void hello(){
		System.out.println("telling hello() what to do from class X");
	};
	
	// Calling abstract method sum(int a, int b) from parent Y but wihtout word abstract and asking to return something 
	public int sum(int a, int b) {
		return (a+b+b);
	};
	
	
	//public abstract void printMe();
		
	
}//end of class

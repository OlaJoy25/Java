/*This program is used to demonstrate the implementation of Interfaces*/
public class Main {
	public static void main(String[] args) {
		
	/* An object is created for Cat*/	
	Cat C = new Cat();
	
	/* This object is used to call the modes define in the class Cat*/
	C.feeds();
	C.attack();
	
	/* An object is created for Lion*/
	Lion L = new Lion();
	/* This object is used to call the modes define in the class Lion*/
	L.attack();
	
	
	/* An object is created for Dog */
	Dog D = new Dog();
	/* This object is used to call the modes define in the class Cat*/
	D.feeds();
	
	
	
	}
	


}

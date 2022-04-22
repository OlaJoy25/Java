/*implement the interface  Domestic*/

public class Dog implements Domestic{

	
	/* A method is implemented through overriding, our method here is feeds 
	 * and the print statement is used to indicate what this method will be doing */
	@Override
	public void feeds() {
		System.out.println("Dogs are ominivores");
		
	}

}

/*This class implements both interfaces, since a cat can exist as both*/
public class Cat implements Domestic,Terrestial{

	
/* A method is implemented through overriding, our method here is feed 
 * and the print statement is used to indicate what this method will be doing */
	@Override
	public void feeds() {
       System.out.println("Cats are obligate-carnivores depending on if they are wild or not ");
	
	}

	/* Another  method is implemented through overriding, since we implemented two interfaces 
	 * and the print statement is used to indicate what this method will be doing */
	@Override
	public void attack() {
		System.out.println("Wild cats attack other weak animals");
		
	}

	
		
	}

	
	



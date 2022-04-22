/*implement the interface  Terrestrial*/

public class Lion  implements Terrestial{

	/* A method is implemented through overriding, our method here is attack
	 * and the print statement is used to indicate what this method will be doing */
	@Override
	public void attack() {
     
		System.out.println("The Lion attacks weaker animals");
	}

}


public class Question3 {
	
	
	public static void main(String[] args) {

		
		
		Car transport = new Car();
		transport.go();
		
		Motorcycle cycle = new Motorcycle();
		
		cycle.stop();
		
		System.out.println(transport.speed);
		System.out.println(cycle.speed);
		
		System.out.println("A Car has " + transport.seats + "seats");
		System.out.println("Motorcycles have" + cycle.saddles + "saddles");
		
		System.out.println("A Car has"   + transport.wheels + "wheels");
		System.out.println("Motorcycles have" + cycle.wheels + "wheels");
		
	}

}

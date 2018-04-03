import java.util.Random;


public class ServicesController {

	public int getRandomNumber() {
		System.out.println("Generating Number..");
		Random rand = new Random();
		int  n = rand.nextInt(50);
		System.out.println(+n +" is your number");
		return n;
	}
	
	public static void main(String args[]) {
		ServicesController service = new ServicesController();
		service.getRandomNumber();
	}
}

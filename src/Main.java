// Special thanks to Bro Code for his videos
public class Main {

	public static void main(String[] args) {
		
		String x = "water";
		String y = "Kool-Aid";
		
		// x = y; Both became Kool-Aid
		// y = x; Both became water
		
		String temp;
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x changed to: " + x);
		System.out.println("y changed to: " + y);

	}

}

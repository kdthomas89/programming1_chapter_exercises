/*
 * The MilesToKilometers program uses a do-while loop and a printf function to 
 * output a table to display the conversion rate of 1-10 miles in kilometers.
 * 
 * Kyle Thomas, Eclipse 4.7, program last updated 10/5/17 at 10:38pm.
 */
public class MilesToKilometers {

	public static void main(String[] args) {
		
		//declare and initialize variables
		int numberOfKilos = 1;
		int mile = 0;
		double kilo;
		
		//printf to output header
		System.out.printf("%s%12s\n", "Miles", "Kilometers");
		
		//do-while loop to multiply the number of kilometers being calculated by the length of a kilometer, and increasing the value of mile and numberOfKilos each iteration
		do {
			kilo = 1.609 * numberOfKilos;
			mile++;
			numberOfKilos++;
			//printf to output the conversion table
			System.out.printf("%d%11.3f\n", mile, kilo);
		//stop the loop when the value of the mile variable reaches 10
		} while (mile < 10);

	}

}

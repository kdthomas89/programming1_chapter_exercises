/*
 * The TestTemperature class uses two methods to calculate the conversion of a given tempurature from celsius to fahrenheit, and vice versa. The main method then calls each of these methods in a while loop to 
 * iterate through several different temperature values and convert those values from one temperature to the other. The program then displays all of these temperature values in both celsius and fahrenheit in 
 * a table in the console.
 * 
 * Kyle Thomas, Eclipse 4.7, program last updated 10/28/17 at 1:30am.
 */
public class TestTemperature {

	public static void main(String[] args) {
		
		//declare and initialize variables, celsiusF is the celsius temperature used in the fahrenheit calculation, hence the F at the end. Same with fahrenheitC and the celsius calculation
		double celsiusF = 40.0;
		double fahrenheitC = 120.0;
		double fahrenheit;
		double celsius;
		
		//display header and line in between header and table
		System.out.printf("%s%19s%7s%16s%13s\n", "Celsius", "Fahrenheit", "|", "Fahrenheit", "Celsius");
		System.out.println("--------------------------------------------------------------");
		
		//while loop with two nested two-way if statements that will continue to iterate through the data until the two temperatures reach the 31.0 and 30.0 respectively. While iterating, the loop calls the 
		//celsiusToFahrenheit and fahrenheitToCelsius methods to calculate the conversion rate of the given temperature to the other measurement and display both sets of temperatures
		while (celsiusF >= 31.0 && fahrenheitC >= 30.0) {
			
			//calling the methods to calculate temperature conversion
			fahrenheit = celsiusToFahrenheit(celsiusF);
			celsius = fahrenheitToCelsius(fahrenheitC);
			
			//two two-way if statements to display the current value of temperature in both celsius and fahrenheit, first for celsius to fahrenheit, and then fahrenheit to celsius, then moving to the next line
			if (fahrenheit >= 100.0) {
				System.out.printf("%.1f%17.1f", celsiusF, fahrenheit);
			}
			else {
				System.out.printf("%.1f%16.1f", celsiusF, fahrenheit);
			}
			
			if (celsius >= 100.0 || celsius < 0 || celsius >= 10.0 && fahrenheitC < 100.0) {
				System.out.printf("%23.1f%16.1f\n", fahrenheitC, celsius);
			}
			
			else {
				System.out.printf("%23.1f%15.1f\n", fahrenheitC, celsius);
			}
			
			//subtract 10 and 1 from the respective variable values each iteration
			fahrenheitC -= 10;
			celsiusF -= 1;
		}	
			
	}
		
	//method to calculate the conversion from celsius to fahrenheit
	public static double celsiusToFahrenheit(double celsius) {
		
		double fahrenheit;
		fahrenheit = (9.0 / 5) * celsius + 32;
		return fahrenheit;
	}
	
	//method to calculate the conversion from fahrenheit to celsius
	public static double fahrenheitToCelsius(double fahrenheit) {
		
		double celsius;
		celsius = (5.0 / 9) * (fahrenheit - 32);
		return celsius;
	}

}

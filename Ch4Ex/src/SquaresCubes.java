/*//
 * The SquaresCubes program outputs the squares and cubes of numbers 0-10, as well as the root numbers, in a table. The table is formatted so the first digit of each number
 * in each of the columns lines up.
 *
 * Kyle Thomas, Eclipse 4.7, program last updated 9/29/17 at 5:24am.
 */
public class SquaresCubes {

	public static void main(String[] args) {
		
		//declare and initialize variables
		int num0 = 0;
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		int num5 = 5;
		int num6 = 6;
		int num7 = 7;
		int num8 = 8;
		int num9 = 9;
		int num10 = 10;
		
		//use the pow method of the Math class to calculate squares and cubes of each value
		double square0 = Math.pow(0, 2);
		double cube0 = Math.pow(0, 3);
		
		double square1 = Math.pow(1, 2);
		double cube1 = Math.pow(1, 3);
		
		double square2 = Math.pow(2, 2);
		double cube2 = Math.pow(2, 3);
		
		double square3 = Math.pow(3, 2);
		double cube3 = Math.pow(3, 3);
		
		double square4 = Math.pow(4, 2);
		double cube4 = Math.pow(4, 3);
		
		double square5 = Math.pow(5, 2);
		double cube5 = Math.pow(5, 3);
		
		double square6 = Math.pow(6, 2);
		double cube6 = Math.pow(6, 3);
		
		double square7 = Math.pow(7, 2);
		double cube7 = Math.pow(7, 3);
		
		double square8 = Math.pow(8, 2);
		double cube8 = Math.pow(8, 3);
		
		double square9 = Math.pow(9, 2);
		double cube9 = Math.pow(9, 3);
		
		double square10 = Math.pow(10, 2);
		double cube10 = Math.pow(10, 3);
		
		//use printf to format table so that the first digit of each number in each column lines up with the first letter of each word in the header of that column
		System.out.printf("%s%8s%6s\n", "number", "square", "cube");
		System.out.printf("%d%8.0f%8.0f\n", num0, square0, cube0);
		System.out.printf("%d%8.0f%8.0f\n", num1, square1, cube1);
		System.out.printf("%d%8.0f%8.0f\n", num2, square2, cube2);
		System.out.printf("%d%8.0f%9.0f\n", num3, square3, cube3);
		System.out.printf("%d%9.0f%8.0f\n", num4, square4, cube4);
		System.out.printf("%d%9.0f%9.0f\n", num5, square5, cube5);
		System.out.printf("%d%9.0f%9.0f\n", num6, square6, cube6);
		System.out.printf("%d%9.0f%9.0f\n", num7, square7, cube7);
		System.out.printf("%d%9.0f%9.0f\n", num8, square8, cube8);
		System.out.printf("%d%9.0f%9.0f\n", num9, square9, cube9);
		System.out.printf("%d%9.0f%9.0f\n", num10, square10, cube10);
			
	}

}

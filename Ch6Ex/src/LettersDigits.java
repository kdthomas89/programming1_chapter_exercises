import java.util.Scanner;
public class LettersDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String string;
		int dCount, lCount;
		
		System.out.println("Enter a string: ");
		string = input.nextLine();
		
		lCount = countLetters(string);
		dCount = countDigits(string);
		
		System.out.println("The number of letters is " + lCount);
		System.out.println("The number of digits is " + dCount);
		

	}
	
	public static int countLetters(String s) {
		
		int count = 0;
		
		for (int i = 0; i <= s.length() - 1; i++) {
			
			if (Character.isLetter(s.charAt(i))){
				count++;
			}
		}
		
		return count;
	}
	
	public static int countDigits(String s) {
		
		int count = 0;
		
		for (int i = 0; i <= s.length() - 1; i++) {
			
			if (Character.isDigit(s.charAt(i))) {
				count++;
			}
		}
		
		return count;
		
	}

}

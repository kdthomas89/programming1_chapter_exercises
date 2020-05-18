/*
 * The Calendar program prompts the user to enter a year and a first day of the year, it then populates a calendar for the entire based on the given input.
 * It utilizes a for loop with a nested switch statement and several nested for loops to populate the calendar.
 * 
 * Kyle Thomas, Eclipse 4.7, program last updated 10/13/17 at 1:32am.
 */
import java.util.Scanner;
public class Calendar {

	public static void main(String[] args) {
		//declare variables
		int year, firstDay, month, days;
		//initialize days variable so it is recognized below
		days = 0;
		
		//create new scanner
		Scanner input = new Scanner(System.in);

		//prompt user for input
        System.out.print("Enter a year: ");
        year = input.nextInt();

        System.out.print("Enter the first day of the year: ");
        firstDay = input.nextInt();

        //for loop to populate calendar
        for (month = 1; month <= 12; month++) {
           //so the month and year will be centered
           System.out.print("          ");
           //switch statement to populate header with month and year
            switch (month) {
                case 1:
                    System.out.println("January " + year);
                    days = 31;
                    break;
                case 2:
                    System.out.println("February " + year);
                    //two-way if statement to determine if it is a leap year and assign appropriate days to february
                    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                        days = 29;
                    } 
                    else {
                        days = 28;
                    }
                    break;
                case 3:
                    System.out.println("March " + year);
                    days = 31;
                    break;
                case 4:
                    System.out.println("April " + year);
                    days = 30;
                    break;
                case 5:
                    System.out.println("May " + year);
                    days = 31;
                    break;
                case 6:
                    System.out.println("June " + year);
                    days = 30;
                    break;
                case 7:
                    System.out.println("July " + year);
                    days = 31;
                    break;
                case 8:
                    System.out.println("August " + year);
                    days = 31;
                    break;
                case 9:
                    System.out.println("September " + year);
                    days = 30;
                    break;
                case 10:
                    System.out.println("October " + year);
                    days = 31;
                    break;
                case 11:
                    System.out.println("November " + year);
                    days = 30;
                    break;
                case 12:
                    System.out.println("December " + year);
                    days = 31;
            }
            
            //populate calendar with a breaker and the days of the week
            System.out.println("-----------------------------");
            System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

            //for loop to populate beginning of calendar with spaces until it reaches the first day of the month
            for (int f = 0; f < firstDay; f++) {
                System.out.print("    ");
            }
            
            //for loop to populate calendar with the days of the month, as well as the spaces in between the dates
            for (int d = 1; d <= days; d++) {
            	//nested two-way if-else statement to remove a space if the day of the month is a double digit integer
                if (d < 10) {
                    System.out.print("   " + d);
                } 
                else {
                    System.out.print("  " + d);
                }
                //nested if statement to move to the next line once the end of the week is reached
                if ((d + firstDay) % 7 == 0) {
                    System.out.println();
                }
            }
            
           //to give some space in between months
           System.out.println();
           System.out.println();

           //so the next month will begin on the appropriate day
           firstDay = (firstDay + days) % 7;
        }

	}

}

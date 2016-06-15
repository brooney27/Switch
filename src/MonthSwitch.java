import java.util.Scanner;

public class MonthSwitch {

	public static void main(String[] args) {
		//This program will print 'May' when you run it.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of days");
        int days = in.nextInt();
		
        switch (days) {
            
        	case 28: System.out.println("February (non-leap year)");
        			break;
        	case 29: System.out.println("February (leap year)");
        			break;
        	case 30:  System.out.println("September April June November");
        			break;
        
        	case 31:  System.out.println("January March May July August October December");
                    break;
            
            default: System.out.println("No months contain that number of days");
                    break;
        }

	}

}

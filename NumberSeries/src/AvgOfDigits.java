import java.util.Scanner;
public class AvgOfDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.print("Enter Number: ");
		
		int num = scan.nextInt(); //1234 123 12 1
		int sum = 0; // 4 7 9 10
		int count = 0; // 1 2 3 4
		
		while (num != 0) { 
			int digit = num % 10; // 4 3 2 1
			sum = sum + digit; // 0+4=4, 4+3=7, 7+2=9, 9+1=10
			count = count +1; // 0+1=1, 1+1=2 , 2+1=3 , 3+1=4
			num = num / 10; // 123 12 1
		}
		
		double avg = (double) sum / count; // 10/4 = 2.5
		
		System.out.println("Average of digit is: "+ avg);

	}

}


//import java.util.Scanner;
//
//class AvgOfDigits {
//  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//
//    System.out.println("Enter a number:");
//    int num = sc.nextInt();  // User input
//
//    int sum = 0;     // To store total of digits
//    int count = 0;   // To count digits
//
//    while(num != 0) {
//      int digit = num % 10;   // Get last digit
//      sum = sum + digit;      // Add digit to sum
//      count = count + 1;      // Count the digit
//      num = num / 10;         // Remove the last digit
//    }
//
//    double average = (double)sum / count;  // Calculate average
//
//    System.out.println("Average of digits: " + average);
//  }
//}


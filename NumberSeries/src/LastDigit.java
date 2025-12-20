//import java.util.Scanner;
//public class LastDigit {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the number: ");
//		int num = scan.nextInt();
//        int res =num % 10;
//        
//        {
//        System.out.println("last digit is " + res );
//
//
//	}
//
//}
//}
//==============Both the code works its just a practice=================================
import java.util.Scanner;
class LastDigit{
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number: ");
		
		int num = scan.nextInt();
		int res = num % 10;// 12.3 - 3
		{
			System.out.println("The Last Digit is from the number " + num + " is "+ res);
		}
	}
	
}

//import java.util.Scanner;
//public class RemoveEnding {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the number: ");
//		int num = scan.nextInt();
//		int res = num / 10; //gives reminder 12.3 - 12
//		
//		{
//			System.out.println("The first number is: " + res);
//		}
//
//	}
//
//}
//==============Both the code works its just a practice=================================
import java.util.Scanner;
class RemoveEnding{
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		int num = scan.nextInt();
		int res = num / 10;
		int temp = num % 10;
		{
			System.out.println("The number is: " +res+ " from the given input " +num + " and the removed number is: " +temp);
		}
	}
}

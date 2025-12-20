//import java.util.Scanner;
//public class EvenOdd {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the number: ");
//		int num = scan.nextInt();
//		if (num % 2 ==0 ) {
//			System.out.println(num+ ": is the even number");
//		}else {
//			System.out.println(num + ": is the odd number");
//		}
//
//	}
//
//}
//==============Both the code works its just a practice=================================
import java.util.Scanner;
public class EvenOdd{
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		if (num % 2 == 0) {
			System.out.println("The number entered "+ num +" is even number.");
			
		}else {
			System.out.println("The number entered "+ num + " is odd number.");
		}
		
	}
}


//import java.util.Scanner;
//public class Reverse {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the number");
//		int num = scan.nextInt();
//		int temp = num;
//		int rev = 0;
//		
//		while(num !=0){
//			int b = num % 10;
//			rev = rev * 10 + b;
//			num =num / 10;
//		}
//		System.out.println("The reversed value for " + temp + " is : " + rev );
//	}
//
//}
//==============Both the code works its just a practice more understanding in 2nd code=================================
import java.util.Scanner;
class Reverse{
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = scan.nextInt(); //123  12  1
		int temp = num ; // 123 12  1
		int rev = 0; //0 3 2 1
		
		while (num !=0 ) {
			int b = num % 10; // starting numbers  3  2  1 
			rev = rev * 10 + b; // 3 2 1
			num = num / 10; // ending numbers  12  1
		}
		System.out.println("The Reversed Number is " + rev);
	}
}

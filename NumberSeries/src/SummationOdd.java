import java.util.Scanner;
public class SummationOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number: "); 
		
		int num=scan.nextInt();//12345  1234 123 12 1
		int sum = 0; //5 3 8 9
		
		while (num != 0) {
			int digit =num % 10; //  5 4 3 2
			if (num % 2 != 0) { //5(true),4(false), 3(true),2(false)
				sum = sum +digit; //0+5=5, 5+3=8, 8+1=9
			}
			num = num /10; //1234 123 12 1 
		}
		
		System.out.println("The summation of odd numbers is: "+sum);

	}

}

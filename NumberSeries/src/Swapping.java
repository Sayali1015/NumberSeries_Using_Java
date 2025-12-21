import java.util.Scanner;
public class Swapping {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = scan.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = scan.nextInt();
		
		System.out.println("Before Swapping");
		System.out.println(num1);
		System.out.println(num2);
		
		//logic
		int temp = num1;
		num1 = num2;
		num2 = temp;
		 
		 
		 System.out.println("After Swapping");
		 System.out.println(num1);
		 System.out.println(num2);
	}

}

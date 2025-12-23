import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number: ");
		
		int num = scan.nextInt();
		int large = num % 10; 
		num = num / 10; 
		int rem = 0; 
		
		while(num != 0) { 
			rem = num % 10;  
			
		if(large < rem) { 
			large = rem; 
		}
		num = num /10; 
		}
		System.out.println("Largest number is: "+ large);

	}

}

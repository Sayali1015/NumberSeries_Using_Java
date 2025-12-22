import java.util.Scanner;
class CountDigit{
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		
		//logic
		int num = scan.nextInt(); //1234  123 12 1
		int count = 0; //4
		
		if(num == 0) {
			count = 1;
		}
		
		else {
			while (num !=0) {
				int rem = num % 10; //4 3 2 1
				count ++; //4
				num = num /10; // 123 12 1
			}
			
		}
		
		System.out.println("Count of the entered number is : "+ count);
	}
}
import java.util.Scanner;
public class palindromeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		
		int num = scan.nextInt();
		int temp = num;
		int res = 0;
		
		while (num != 0) {
			int b = num % 10;
			res = res * 10 + b;
			num = num / 10;
		}
		
		if (temp == res) {
			System.out.println("The entered number is a Palindrome number: "+ temp);
			
		} else {
			System.out.println("The entered number is not a Palindrome number: "+ temp);
			
		}	

	}

}

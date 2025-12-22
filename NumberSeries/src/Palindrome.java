import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number: ");
		
		int num = scan.nextInt(); //1122
		int temp = num;
		int rev =0;

		while (num != 0) {
			int b = num % 10;
			 rev = rev *10 +b;
			num = num /10;
		}
		
		
			if(temp == rev) {
				System.out.println("The entered number is a palindrome number: " + temp); //1221
			}
			else if (temp != rev) {
				System.out.println("The entered number is not a palindrome number. " );
				
			}
			
			}
	
		}
		
	


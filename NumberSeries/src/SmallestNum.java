import java.util.Scanner;
public class SmallestNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number: ");
		
		int num = scan.nextInt();// 123  12 1
		int small = num % 10; // 3 2 1
		num = num /10; // 12 1
		int rem = 0;//2 1
		
		while (num != 0) {
			rem = num % 10; // 3 2 1 
			
		if(small > rem) { // 3>2(true), 2>1(true), 1 > 1 (false)
				small = rem; // 3 = 2(false), 2 = 1(false)
			}
		num = num/ 10; // 12 1
		}
		
		System.out.println("The Smallest number is: "+ small);
		
	}

}

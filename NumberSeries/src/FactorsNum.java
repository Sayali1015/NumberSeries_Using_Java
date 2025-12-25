import java.util.Scanner;
class FactorsNum{
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = scan.nextInt();
		
		for (int i =1; i<=num; i++) {
			if (num % i == 0) {
				System.out.println(i+ " is the factor of "+num);
			}
		}
	}
}
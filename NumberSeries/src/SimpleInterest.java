import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Principle Amount: ");
		int num= scan.nextInt();
		
		System.out.println("Enter the Rate percent: ");
		double rate= scan.nextDouble();
		
		System.out.println("Enter the year: ");
		int year= scan.nextInt();
		double res = (num* rate* year)/100;
		
		System.out.println("The SimpleInterest is : "+ res);
		
	}

}

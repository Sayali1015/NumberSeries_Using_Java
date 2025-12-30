import java.util.Scanner;
public class AvgFactor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number: ");
		
		int num = scan.nextInt();
		int sum = 0;
		int count = 0;
		
		for (int i = 1; i <= num ; i++) {
			if (num % i == 0) {
				
				System.out.println(i+ " is the factor of "+ num);
				sum = sum + i;
				count++;
			}
		}
		double avg = (double)sum/count;
		
		System.out.println("The Avg of Factor is: "+ avg);
	}

}






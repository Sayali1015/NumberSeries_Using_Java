import java.util.Scanner;
public class SumFactor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number: ");
		
		int num = scan.nextInt();  //2
		int sum =0;  //0 1 2 3
		for (int i =1 ; i <=num ; i++) {  // 1 , 1 <=2(true), 2 : i=2/ 2<=2(true)
			if (num % i == 0) 
			{ //(false),(true)
				System.out.println(i+ " is the factor of "+ num);
				sum = sum + i; // 0+1=1, 2+1=3
			}
		}
		
			System.out.println("The Summation of Factor is: "+ sum);
		
	}

}




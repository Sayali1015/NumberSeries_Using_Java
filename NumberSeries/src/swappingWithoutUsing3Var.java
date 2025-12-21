import java.util.Scanner;
public class swappingWithoutUsing3Var {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Enter first number: ");
		int val1 = scan.nextInt();
		
		System.out.print("Enter second number: ");
		int val2 = scan.nextInt();
		
		System.out.println("Before Swapping");
		System.out.println(val1);
		System.out.println(val2);
		
		//logic
		System.out.println("After Swapping");
		val1 = val1+val2; //10+20=30  val1 30
		val2 = val1-val2; //30-20=10  val2 10
		val1 = val1-val2; //30-10=20  val1 20
		
		System.out.println(val1);
		System.out.println(val2);		
	}

}

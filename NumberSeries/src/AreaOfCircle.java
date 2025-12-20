
import java.util.Scanner;
public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Area: ");
		double num = scan.nextDouble();
		double aoc = 3.14*num;
		System.out.println("The area of Circle is: "+ aoc+ " for "+ num);
		
	}

}

import java.util.Scanner;
public class AlphabetsSpecCharNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Input: ");
		
		char ch  = scan.next().charAt(0);
		 
		if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
			System.out.println("Entered Input is an Alphabet.");
			
		}
		else if(ch >= '0' && ch <= '9') {
			System.out.println("Entered Input is a Number.");
		}
		else if (ch <= '0') {
			System.out.println("Entered Input is a Negative Number.");
		}
		else {
			System.out.println("Entered Input is a Special Character.");
		}

	}

}

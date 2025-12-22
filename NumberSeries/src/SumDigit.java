import java.util.Scanner;
	class SumDigit{
		public static void main (String []args) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter Number: ");
			
			int num = scan.nextInt();
			int sum =0;
			int temp = num;
			
			while (temp !=0) {
				int digit = temp % 10;
				sum = sum + digit;
				temp = temp / 10;
			}
			System.out.println("Sum of the Entered Number is :"+sum);
		}
	}




























//import java.util.Scanner;
//class SumDigit
//{
//    public static void main(String[] args) 
//    {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the number : ");
//        int number = scan.nextInt(); //1234
//        int sum = 0; //4 7 9 10
//        int temp = number; //1234 123 12 1
//        
//        while (temp != 0) {
//            int digit = temp % 10; //4 3 2 1
//            sum = sum + digit; //4  7 9 10
//            temp= temp / 10; //123 12 1
//        }
// System.out.println("Sum of digits of " + number +   " is : " + sum);
//        }   
//    }

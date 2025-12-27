import java.util.Scanner;
class SummationEven 
{
    public static void main(String[] args) 
    {
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Enter Number: ");
        int num = scan.nextInt(); // 1234 123 12 1
        int sum = 0; // 6
        
        //loop start kela 
        while (num != 0){ 
            
            int digit = num % 10;  //  4 3 2 1
            if (digit % 2 ==0) // 4(true),3(false),2(true),1(false)
            {
                sum =sum + digit; // 0+4=4, 4+2=6
            }
            num = num /10; //  123 12 1
            
        }
        {
            System.out.println("The summation of even number is : " + sum);
        }
    }
}


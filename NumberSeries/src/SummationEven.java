import java.util.Scanner;
class SummationEven 
{
    public static void main(String[] args) 
    {
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Enter Number: ");
        int num = scan.nextInt(); // input number dila
        int sum = 0; // sum startimg madhe 0 aste nehemi when it     comes for adding wale question 
        
        //loop start kela 
        while (num != 0){ 
            
            int digit = num % 10;  // input madhla last digit find hote 
            if (digit % 2 ==0) // digits even ahe ka nhi check hote 
            {
                sum =sum + digit; // sum variable madhe digit j ki even ahet ty sum karun store hotat
            }
            num = num /10; // remove the last digit 
            
        }
        {
            System.out.println("The summation of even number is : " + sum);
        }
    }
}


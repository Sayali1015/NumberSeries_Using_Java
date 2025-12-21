//import java.util.Scanner;
//public class AreaOfRectangle {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter Length Of the Rectangle: ");
//		double length = scan.nextDouble();
//		
//		System.out.println("Enter Width of the Rectangle: ");
//		double width = scan.nextDouble();
//		
//		double res= length*width;
//		System.out.println("Area of Rectangle is: " + res);
//			}
//		}

//===========Same code using Functions===========================

import java.util.Scanner;
class AreaOfRectangle{
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of Rectangle: ");
		double length = scan.nextDouble();
		
		System.out.println("Enter the width of the Rectangle: ");
		double width = scan.nextDouble();
		
		double res = areaOfRect(length,width) ;
		System.out.println ("Area of Rectangle is : "+res);
	}
	
	public static double areaOfRect(double length, double width) {
		return length * width;
	}
}



package operatorTypes;

import java.util.Scanner;

public class ArithmeticOperators {
	public static void main(String[] args) {
//1)
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a:");
		int a=sc.nextInt();
		System.out.println("Enter value of b:");
		int b=sc.nextInt();
		
/*2)		(When you give value of a & b directly in program) 
 		int a=20;
		int b=10;							*/
		
		System.out.println("Addition of a & b:"+(a+b));
		System.out.println("Subtraction of a & b:"+(a-b));
		System.out.println("Multiplication of a & b:"+(a*b));
		System.out.println("Division of a & b:"+(a/b));
		System.out.println("Mod of a & b:"+(a%b));
	}
}
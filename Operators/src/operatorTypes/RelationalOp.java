package operatorTypes;

import java.util.Scanner;

public class RelationalOp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first no.:");
		int a=sc.nextInt();
		System.out.println("Enter second no.:");
		int b=sc.nextInt();
		
	/*	int a=10;
		int b=20; */
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
	}

}

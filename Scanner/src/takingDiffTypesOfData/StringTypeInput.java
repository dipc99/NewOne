package takingDiffTypesOfData;

import java.util.Scanner;

public class StringTypeInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();		// or use sc.next()
		System.out.println(s);
	}

}

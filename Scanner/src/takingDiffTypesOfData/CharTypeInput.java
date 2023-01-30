package takingDiffTypesOfData;

import java.util.Scanner;

public class CharTypeInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Char.");
		char c=sc.next().charAt(0);
		System.out.println(c);
	}

}


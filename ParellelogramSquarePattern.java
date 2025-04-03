package StarPatterns;

import java.util.Scanner;

public class ParellelogramSquarePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int i;
		int j;
		for(i=1; i<=rows ; i++) {
			for(j=1; j<=i; j++) 
				System.out.print(" ");
			for(j=1; j<=cols; j++)
				System.out.print("*");
			System.out.println();
		}
	}

}

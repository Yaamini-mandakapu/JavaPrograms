package StarPatterns;

import java.util.Scanner;

public class RhombusPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int i;
		int j;
		for(i=1; i<=n; i++) {
			for(j=n; j>i; j--)
				System.out.print(" ");
			for(j=1; j<n; j++)
				System.out.print("*");
			System.out.println();
		}
	}

}

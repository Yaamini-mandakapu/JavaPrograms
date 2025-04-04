package StarPatterns;

import java.util.Scanner;

public class TriangleNumberPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int i,j,k;
		for(i=1; i<=n; i++) {
			for(j=1; j<=i; j++) 
				System.out.print(i);
			System.out.println();
			
		}
			

	}

}

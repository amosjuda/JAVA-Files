package soma_vetorES;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many values will be each vector? ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		
		System.out.println("Enter the vector A values: ");
		for(int i=0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the vector B values: ");
		for(int i=0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		
		System.out.println("RESULTING VECTOR: ");
		for(int i=0; i < n; i++) {
			System.out.println(a[i] + b[i]);
		}
		
		
		sc.close();
	}
}

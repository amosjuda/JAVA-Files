package numeros_pares;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int amountP = 0;
		
		System.out.print("how many numbers will you write? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for(int i=0; i < vect.length; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("PAIRS NUMBERS: ");
		for(int i=0; i < vect.length; i++) {
			if(vect[i] % 2 == 0) {
				System.out.print(vect[i] + "  ");
				amountP++;
			}
		}
		System.out.println();
		System.out.println("\nAMOUNT OF PAIRS = " + amountP);
		
		sc.close();
	}
}

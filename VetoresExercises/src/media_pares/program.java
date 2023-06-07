package media_pares;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cont = 0;
		double sum = 0, media = 0;

		System.out.print("How many elements will the vector have? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for(int i=0; i < n; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextInt();
		}
		for(int i=0; i < n; i++) {
			if(vect[i] % 2 == 0) {
				sum += vect[i];
				cont++;
			}
		}
		if(cont != 0) {
			media = sum/cont;
			System.out.printf("PEER AVERAGE = %.1f\n", media);
		} else {
			System.out.println("NO EVEN NUMBER");
		}
			

		sc.close();
	}
}

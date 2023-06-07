package soma_vetor;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double sum = 0;
		double media = 0;
		
		System.out.print("How many numbers will you write? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i=0; i < vect.length; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextDouble();
		}
		System.out.println();
		
		System.out.print("VALUES =");
		for(int i=0; i < vect.length; i++) {
			System.out.print("  " + vect[i]);
			sum += vect[i];
		}
		
		System.out.printf("\nSOMA = %.2f%n", sum);
		media = sum/vect.length;
		System.out.printf("MEDIA = %.2f%n", media);

		sc.close();
	}
}

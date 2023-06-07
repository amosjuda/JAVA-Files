package abaixo_da_media;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double sum = 0, media = 0; 
		
		System.out.print("How many values will the vector have? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i=0; i < n; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		System.out.println();
		
		media = sum/n;
		
		System.out.printf("VECTOR MEDIA = %.3f\n", media);
		System.out.println("BELOW AVERAGE ELEMENTS:");
		for(int i=0; i < n; i++) {
			if(vect[i] < media) {
				System.out.printf("%.1f\n",vect[i]);
			}
		}
		
		
		
		sc.close();
	}

}

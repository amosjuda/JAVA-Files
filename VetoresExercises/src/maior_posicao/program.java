package maior_posicao;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int posbigger = 0;
	    double bigger;
		
		System.out.print("How many numbers will you write? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i=0; i < vect.length; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextDouble();
		}
		
		bigger = vect[0];
		
	    for (int i=1; i<n; i++) {
	        if (vect[i] > bigger) {
	            bigger = vect[i];
	            posbigger = i;
	        }
	    }
		System.out.println();
		System.out.printf("HIGHEST VALUE = %.1f\n", bigger);
		System.out.print("HIGHEST VALUE POSITION = " + posbigger);
		
		
	    
		sc.close();
	}
}

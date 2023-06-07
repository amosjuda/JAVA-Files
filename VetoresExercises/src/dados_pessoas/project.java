package dados_pessoas;

import java.util.Locale;
import java.util.Scanner;

public class project {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cont = 0, contM = 0;
		double bigger = 0, smaller = 0, sum = 0, media =0;
		
		System.out.print("How many people will be typed? ");
		int n = sc.nextInt();
		
		double[] height = new double[n];
		char[] gender = new char[n];
		
		for (int i=0; i < n; i++) {
			System.out.printf("hight da %da people: ", i + 1);
			height[i] = sc.nextDouble();
			System.out.printf("Gedner da %da people: ", i + 1);
			gender[i] = sc.next().charAt(0);
		}
		
		for (int i=0; i<n; i++) {
	        if (height[i] > bigger) {
	            bigger = height[i];
	        }
	        if (height[i] < smaller) {
	        	smaller = height[i];
	        }
	    }
		System.out.printf("Smallest height = %.2f%n", smaller);
		System.out.printf("Largest height = %.2f%n", bigger);
		
		for (int i=0; i<n; i++) {
			if(gender[i] == 'f') {
				sum += height[i];
				cont++;
			}
			if (gender[i] == 'm') {
				contM = contM + 1;
			}
		}
		media = sum/cont;
		System.out.printf("Average height of women = %.2f%n", media);
		System.out.println("Mens number = " + contM);
		
		sc.close();
	}
}

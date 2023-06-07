package alturas;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, minor = 0;
		double sumHeight = 0, averageHeight = 0, heightMinor = 0;
		
		System.out.print("How many people will be entered? ");
		n = sc.nextInt();
		
		String[] name = new String[n];
		int[] age = new int[n];
		double[] height = new double[n];
		
		for(int i=0; i < n; i++) {
			System.out.println(i + 1 + "º person data: ");
			sc.nextLine();
			System.out.print("Name: ");
			name[i] = sc.next();
			System.out.print("Age: ");
			age[i] = sc.nextInt();
			System.out.print("Height: ");
			height[i] = sc.nextDouble();
		}
		for(int i=0; i < n; i++) {
			if(age[i] < 16) {
				minor++;
			}
			sumHeight += height[i];
		}
		averageHeight = sumHeight / n;
		heightMinor = ((double)minor / n) * 100.0;

	    System.out.printf("\nAverage height = %.2f\n", averageHeight);
		
		
		System.out.printf("People under 16 years old: %.1f%%\n", heightMinor);
		for(int i=0; i < n; i++) {
			if(age[i] < 16) {
				System.out.println(name[i]);
			}
		}
		
		sc.close();
	}
}

package mais_velho;

import java.util.Locale;
import java.util.Scanner;

public class product {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many people are you going to type? ");
		int n = sc.nextInt();

		String nameBigger = null;
	    double bigger = 0;
	    
		String[] name = new String[n];
		int[] age = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println(i + 1 + "º person data: ");
			sc.nextLine();
			System.out.print("Name: ");
			name[i] = sc.next();
			System.out.print("Age: ");
			age[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (age[i] > bigger) {
				bigger = age[i];
				nameBigger = name[i];
			}
		}
		System.out.println("PEOPLE MORE OLD: " + nameBigger);
		
		sc.close();
	}
}

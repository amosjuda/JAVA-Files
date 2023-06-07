package vetores;

import java.util.Locale;
import java.util.Scanner;

import entitiesV.product;

public class programV {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		product[] vect = new product[n];
		
		for(int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			vect[i] = new product(name, price);
		}
		
		double sum = 0.0;
		
		for(int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum/vect.length;
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		
		sc.close();
	}
}

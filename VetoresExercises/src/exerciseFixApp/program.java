package exerciseFixApp;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import exerciseFixAppEntities.product;

public class program {
	
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		product[] vect = new product[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i=1; 1 <= n; i++) {
			System.out.println();
			System.out.println("Rent #"+ i +":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new product(name, email);
		}
		System.out.println();
		System.out.println("Busy rooms: ");
		for(int i=0; 1<10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
	}
}

package exercise1;

import java.util.Locale;
import java.util.Scanner;
import exercise1entities.entities1;

public class program1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		entities1 product = new entities1();
		
		System.out.println("Enter rectangle width and height: ");
		product.width = sc.nextDouble();
		product.height = sc.nextDouble();
		
		System.out.println(product);
		
		sc.close();
	}
}

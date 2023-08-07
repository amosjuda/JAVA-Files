package exercFixInterface;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter contact details: ");
		System.out.print("Number: ");
		int contactNumber = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		LocalDateTime date = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Contract value: ");
		double contractValue = sc.nextDouble();
		System.out.print("Enter with a installments number: ");
		int installmentsNumber = sc.nextInt();
		
		System.out.println("Installments: ");
		for(int i = 0; i< x; i++) {
			System.out.println(" - ");
		}
		
		sc.close();
	}
}

package motivatingProblem;

import java.util.Locale;
import java.util.Scanner;

import motivatingProblemServices.PrintService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		PrintService<String> /* or PrintService<Integer> / because of the <T> the PrintService will only accept 
		the type indicated inside the less-than and greater-than, which in this case
		 is String, or whatever is chosen by preference*/ ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);
		}
		
		ps.print();
		String x = ps.first();
		System.out.println("First: " + x);
		sc.close();
	}
}

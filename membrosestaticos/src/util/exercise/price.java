package util.exercise;

public class price {
	public static final double IOF = 0.06;
	
	public static double currencyConverter(double dollarValue, double dollarPrice) {
		return dollarValue * dollarPrice * (1.0 + IOF);
	}
}

package utils;

public class CurrencyConverter {
	public static double IOF = 0.06;

	public static double dollarToReal(double value, double dollarPrice) {
	return value * dollarPrice * (1.0 + IOF);
	}
}

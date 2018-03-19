package api;

import java.util.Scanner;

public class UrlCreator {
	public static String createUrlString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj datê od (YYYY-MM-DD): ");
		String dateFromString = sc.nextLine();

		System.out.println("Podaj datê do (YYYY-MM-DD): ");
		String dateToString = sc.nextLine();

		System.out.println("Kod waluty (np. USD, EUR, CHF): ");
		String currency = sc.nextLine().toLowerCase();

		StringBuilder builder = new StringBuilder();
		builder.append("http://api.nbp.pl/api/exchangerates/rates/c/");
		builder.append(currency);
		builder.append("/");
		builder.append(dateFromString);
		builder.append("/");
		builder.append(dateToString);
		builder.append("/?format=json");

		sc.close();

		return builder.toString();
	}

}

package api;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) {

		InputStream inputstrem = null;
		BufferedReader bufferedReader = null;
		StringBuilder strBuilder = new StringBuilder();

		try {
			inputstrem = new URL(UrlCreator.createUrlString()).openStream();
			bufferedReader = new BufferedReader(new InputStreamReader(inputstrem, Charset.forName("UTF-8")));

			String cp;
			while ((cp = bufferedReader.readLine()) != null) {
				strBuilder.append(cp);
			}

			ObjectMapper mapper = new ObjectMapper();
			ExchangeRatesTable kurs = mapper.readValue(strBuilder.toString(), ExchangeRatesTable.class);

			System.out.format("%.4f%n", kurs.averageBid());
			System.out.format("%.4f%n", kurs.sdAsk());

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

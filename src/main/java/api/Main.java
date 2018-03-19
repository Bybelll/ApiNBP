package api;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) {

		String json = JsonDownloader.getJsonAsString();
		ObjectMapper mapper = new ObjectMapper();
		ExchangeRatesTable kurs;
		
		try {
			kurs = mapper.readValue(json, ExchangeRatesTable.class);
			System.out.format("%.4f%n", kurs.averageBid());
			System.out.format("%.4f%n", kurs.sdAsk());
		} catch (IOException e) {
			e.printStackTrace();
		}
		


	}

}

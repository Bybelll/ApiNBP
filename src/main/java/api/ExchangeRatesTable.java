package api;

import java.util.List;

public class ExchangeRatesTable {
	private String table;
	private String currency;
	private String code;
	private List<Rate> rates = null;

	public double averageBid() {
		double sum = rates.stream().mapToDouble(element -> element.getBid()).sum();
		return sum / rates.size();
	}

	public double averageAsk() {
		double sum = 0;
		sum = rates.stream().mapToDouble(element -> element.getAsk()).sum();
		return sum / rates.size();
	}

	public double sdAsk() {
		double variance = rates.stream().mapToDouble(element -> Math.pow(element.getAsk() - averageAsk(), 2)).sum();
		return Math.sqrt(variance / rates.size());
	}

	public void setTable(String table) {
		this.table = table;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setRates(List<Rate> rates) {
		this.rates = rates;
	}
}

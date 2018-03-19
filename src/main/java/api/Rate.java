package api;

public class Rate {
	private String no;
	private String effectiveDate;
	private Double bid;
	private Double ask;

	public void setNo(String no) {
		this.no = no;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Double getBid() {
		return bid;
	}

	public void setBid(Double bid) {
		this.bid = bid;
	}

	public Double getAsk() {
		return ask;
	}

	public void setAsk(Double ask) {
		this.ask = ask;
	}
}

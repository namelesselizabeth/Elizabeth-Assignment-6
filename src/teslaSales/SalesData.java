package teslaSales;

import java.time.YearMonth;

public class SalesData {

	YearMonth date;
	Long sales;
	
	SalesData() {
		
	}
	
	SalesData(YearMonth date, Long sales) {
		this.date = date;
		this.sales = sales;
	}
	public YearMonth getDate() {
		return date;
	}
	public void setDate(YearMonth date) {
		this.date = date;
	}
	public Long getSales() {
		return sales;
	}
	public void setSales(Long sale) {
		this.sales = sale;
	}
	@Override
	public String toString() {
		return this.date + " + " + this.sales;
	}
	
}

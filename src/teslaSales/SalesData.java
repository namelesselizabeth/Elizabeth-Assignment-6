package teslaSales;

import java.time.LocalDate;

public class SalesData {

	LocalDate date;
	Long sales;
	
	SalesData() {
		
	}
	
	SalesData(LocalDate date, Long sales) {
		this.date = date;
		this.sales = sales;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
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

package teslaSales;

public class SalesData {

	String date;
	String sales;
	
	SalesData() {
		
	}
	
	SalesData(String date, String sales) {
		this.date = date;
		this.sales = sales;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSales() {
		return sales;
	}
	public void setSales(String sales) {
		this.sales = sales;
	}
	
	
}

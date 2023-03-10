package teslaSales;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TeslaSalesApplication {
	
	public static void main(String args[]) throws IOException {
		
		TeslaSalesApplication tesla = new TeslaSalesApplication();
		
		List<SalesData> model3 = new ArrayList<>();
		List<SalesData> modelS = new ArrayList<>();
		List<SalesData> modelX = new ArrayList<>();
		
		File model3CSV = new File("model3.csv");
		File modelSCSV = new File("modelS.csv");
		File modelXCSV = new File("modelX.csv");
		
		tesla.readCSV(model3CSV, model3);
		tesla.readCSV(modelSCSV, modelS);
		tesla.readCSV(modelXCSV, modelX);
		
		System.out.println("Model 3 Yearly Sales Report \n");
		//tesla.printYearlySales(model3);
		
		System.out.println("Model S Yearly Sales Report \n");
		
		System.out.println("Model X Yearly Sales Report \n");
	}
	
	public void readCSV(File file, List<SalesData> list) throws IOException {
		
		BufferedReader fr = null;
		
		try {
			
			fr = new BufferedReader(new FileReader(file));
			
			String line;
			String[] lines;
			
			@SuppressWarnings("unused")
			String header = fr.readLine();
			
			while ((line = fr.readLine()) != null) {
				
				lines = line.split(",");
				String parsedDate = lines[0];
				String parsedSale = lines[1];
				
				SalesData sales = new SalesData();
				
				YearMonth date = YearMonth.parse(parsedDate, DateTimeFormatter.ofPattern("MMM-yy"));
				Long sale = Long.parseLong(parsedSale);
				sales.setDate(date);
				sales.setSales(sale);
				
				list.add(sales);
			}
			
		} finally {
			
			if(fr != null) {
				
				fr.close();
			}
		}
	}
	
	public void printYearlySales(List<SalesData> list) {
	
		Map<Object, Long> yearlySales = null;
		
		yearlySales = list.stream()
					      .collect(
					       Collectors.groupingBy(date -> date.getDate().getYear(), Collectors.summingLong(SalesData::getSales)));
			
		
	}

	public void streamWorstYear() {
		
	}
	
	public void streamBestYear() {
		
	}
}

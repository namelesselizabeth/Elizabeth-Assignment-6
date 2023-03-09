package teslaSales;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
		
		System.out.println("Model S Yearly Sales Report \n");
		
		System.out.println("Model X Yearly Sales Report \n");
	}
	
	public void readCSV(File file, List<SalesData> list) throws IOException {
		
		BufferedReader fr = null;
		
		try {
			
			fr = new BufferedReader(new FileReader(file));
			
			String line;
			String[] lines;
			
			String header = fr.readLine();
			
			while ((line = fr.readLine()) != null) {
				
				lines = line.split(",");
				SalesData sales = new SalesData(lines[0], lines[1]);
				list.add(sales);
			}
		} finally {
			
			if(fr != null) {
				
				fr.close();
			}
		}
	}
	
	public void printYearlySales(List<SalesData> list) {
		
	}
	
	public void streamWorstYear() {
		
	}
	
	public void streamBestYear() {
		
	}
}

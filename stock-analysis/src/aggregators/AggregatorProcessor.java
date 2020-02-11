package aggregators;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import fileprocessors.StockFileReader;

public class AggregatorProcessor <T extends Aggregator> {
	
	T aggregator;
	String file;
	
	public AggregatorProcessor(T aggregator, String file) {
		super();
		this.aggregator = aggregator;
		this.file = file;
	}
	
	public double runAggregator(int colx) throws IOException {
		StockFileReader fileReader = new StockFileReader(file);
		List<String> lines = fileReader.readFileData();
		
		colx--; //Array start at 0
		
		for(String line : lines) {
			String [] numbers = line.split(",");
			double value = Double.parseDouble(numbers[colx]);
			aggregator.add(value);
		}
		
		double number = aggregator.calculate();
		
		return number;
		
	}
}

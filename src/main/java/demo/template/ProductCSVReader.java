package demo.template;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ProductCSVReader {

	public List<Product> getAll(File file) throws Exception {
		List<Product> returnData = new ArrayList<Product>();
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line = reader.readLine();
			while (line != null && !"".equals(line.trim())) {
				String[] tokens = line.split("\\s*,\\s*");
				Product product = new Product(Integer.parseInt(tokens[0]), tokens[1], Double.parseDouble(tokens[2]));
				returnData.add(product);
				line = reader.readLine();
			}
		}
		return returnData;
	}
}

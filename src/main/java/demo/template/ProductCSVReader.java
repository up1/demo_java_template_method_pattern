package demo.template;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ProductCSVReader {

	public List<Product> getAll(File customersFile) throws Exception {
		List<Product> products = new ArrayList<Product>();
		try (BufferedReader reader = new BufferedReader(new FileReader(customersFile))) {
			String line = reader.readLine();
			while (line != null && !line.trim().equals("")) {
				String[] tokens = line.split("\\s*,\\s*");
				Product product = new Product(Integer.parseInt(tokens[0]), tokens[1], Double.parseDouble(tokens[2]));
				products.add(product);
				line = reader.readLine();
			}
		}
		return products;
	}

}

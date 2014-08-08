package demo.template;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CustomerCSVReader {

	public List<Customer> getAll(File file) throws Exception {
		List<Customer> returnData = new ArrayList<Customer>();
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line = reader.readLine();
			while (line != null && !"".equals(line.trim())) {
				String[] tokens = line.split("\\s*,\\s*");
				Customer customer = new Customer(Integer.parseInt(tokens[0]), tokens[1], tokens[2]);
				returnData.add(customer);
				line = reader.readLine();
			}
		}
		return returnData;
	}

}

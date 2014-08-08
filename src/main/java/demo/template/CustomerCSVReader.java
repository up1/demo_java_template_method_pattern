package demo.template;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CustomerCSVReader {

	public List<Customer> getAll(File customersFile) throws Exception {
		List<Customer> customers = new ArrayList<Customer>();
		try (BufferedReader reader = new BufferedReader(new FileReader(customersFile))) {
			String line = reader.readLine();
			while (line != null && !line.trim().equals("")) {
				String[] tokens = line.split("\\s*,\\s*");
				Customer customer = new Customer(Integer.parseInt(tokens[0]), tokens[1], tokens[2]);
				customers.add(customer);
				line = reader.readLine();
			}
		}
		return customers;
	}

}

package demo.template;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CustomerCSVReaderTest {

	@Test
	public void readCustomersFromCSVFileShouldHaveSizeEqualTwo() throws Exception {
		String filename = new File(".").getAbsolutePath() + "/src/main/resources/customers.csv";
		File customersFile = new File(filename);
		CustomerCSVReader customerCSVReader = new CustomerCSVReader();
		List<Customer> customers = customerCSVReader.getAll(customersFile);

		List<Customer> expectedCustomers = new ArrayList<Customer>();
		expectedCustomers.add(new Customer(1, "Somkiat2", "Up1@somkiat.cc"));
		expectedCustomers.add(new Customer(2, "Mr.XXX", "Up2@somkiat.cc"));
		assertEquals(expectedCustomers.size(), customers.size());
	}
}

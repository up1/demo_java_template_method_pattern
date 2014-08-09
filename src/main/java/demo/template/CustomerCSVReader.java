package demo.template;


public class CustomerCSVReader extends AbstractCSVReader<Customer> {
	
	@Override
	public Customer unmarshall(String[] tokens) {
		Customer customer = new Customer(Integer.parseInt(tokens[0]), tokens[1], tokens[2]);
		return customer;
	}

}

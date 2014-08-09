package demo.template;


public class ProductCSVReader extends AbstractCSVReader<Product> {

	@Override
	public Product unmarshall(String[] tokens) {
		Product product = new Product(Integer.parseInt(tokens[0]), tokens[1], Double.parseDouble(tokens[2]));
		return product;
	}
}

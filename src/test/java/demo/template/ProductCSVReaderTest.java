package demo.template;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ProductCSVReaderTest {

	@Test
	public void readCustomersFromCSVFileShouldHaveSizeEqualTwo() throws Exception {
		String filename = new File(".").getAbsolutePath() + "/src/main/resources/products.csv";
		File productsFile = new File(filename);
		ProductCSVReader productCSVReader = new ProductCSVReader();
		List<Product> products = productCSVReader.getAll(productsFile);

		List<Product> expectedProducts = new ArrayList<Product>();
		expectedProducts.add(new Product(1, "Product 1", 100));
		expectedProducts.add(new Product(2, "Product 2", 200));
		expectedProducts.add(new Product(3, "Product 3", 300));
		assertEquals(expectedProducts.size(), products.size());
	}
}

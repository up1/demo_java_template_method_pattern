package demo.template;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCSVReader<T> {

	public List<T> getAll(File file) throws Exception {
		List<T> returnData = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line = reader.readLine();
			while (line != null && !"".equals(line.trim())) {
				String[] tokens = line.split("\\s*,\\s*");
				T data = unmarshall(tokens);
				returnData.add(data);
				line = reader.readLine();
			}
		}
		return returnData;
	}

	public abstract T unmarshall(String[] tokens);

}

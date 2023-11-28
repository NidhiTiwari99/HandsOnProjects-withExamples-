package handson;

import java.util.*;

class Products {
	int id;
	String name;
	float price;

	public Products(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class JavaStreamExample {
	public static void main(String[] args) {
		List<Products> pl = new ArrayList<Products>();
		pl.add(new Products(1, "HP Laptop", 25000f));
		pl.add(new Products(2, "Dell Laptop", 30000f));
		pl.add(new Products(3, "Lenevo Laptop", 28000f));
		pl.add(new Products(4, "Sony Laptop", 28000f));
		pl.add(new Products(5, "Apple Laptop", 90000f));
		
		pl.stream().filter(product -> product.price == 30000)
				.forEach(product -> System.out.println(product.name));
	}
}

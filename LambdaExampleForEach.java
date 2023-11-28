package handson;

import java.util.*;

public class LambdaExampleForEach {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Nidhi");
		list.add("Vidhi");
		list.add("Sonam");
		list.add("Shivam");

		list.forEach((n) -> System.out.println(n));
	}
}

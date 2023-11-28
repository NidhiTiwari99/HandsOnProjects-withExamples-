package handson;

interface Addable {
	int add(int a, int b);
}

public class LambdaExample2 {
	public static void main(String[] args) {

		Addable ad = (a, b) -> (a + b);
		System.out.println(ad.add(50, 20));

		Addable ad1 = (int a, int b) -> (a + b);
		System.out.println(ad1.add(100, 200));

		Addable ad2 = (int a, int b) -> {
			return (a + b);
		};
		System.out.println(ad2.add(705, 22));

	}
}
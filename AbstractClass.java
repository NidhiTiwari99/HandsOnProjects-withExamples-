package handson;

abstract class AbstractClass {
	public AbstractClass() {
		System.out.println("we can create constructor in abstract class");
	}

	abstract int add(int a, int b);

	int sub(int a, int b) {
		return a - b;
	}

	static int multiply(int a, int b) { 
		return a * b;
	}
}


package handson;

public class AbstractTest extends AbstractClass {
	public int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		AbstractTest a = new AbstractTest();
		int result1 = a.add(25, 36);
		int result2 = a.sub(49, 36); 
		int result3 = AbstractClass.multiply(36, 26);
		System.out.println("Addition: " + result1);
		System.out.println("Substraction: " + result2);
		System.out.println("Multiplication: " + result3);
	}
}

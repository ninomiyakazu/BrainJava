
public class Variable {
	
	public static void main(String[] args) {
		
		int number1 = 10, number2 = 20;
		int total = plus(number1, number2);
		System.out.println("total;" + total);
		
		
	}

	static int plus(int a, int b)
	{
		return a+b;
	}
}

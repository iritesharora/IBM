
public class calculator {
	public static void main(String[] args) {
		char op = '/';
		double x = 10;
		double y = 20;
		double result = 0;
		
		switch (op) {
		case '+':
			result = x+y;
			break;
		case '-':
			result = x-y;
			break;
		case '/':
			result = x/y;
			break;
		case '*':
			result = x*y;
			break;
		}
		System.out.println(result);
	}

}

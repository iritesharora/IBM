
public class compound {
	public static void main(String[] args) {
		double p = 20;
		double r = 5;
		double t = 1;
		double n = 2;
		double k = n*t;
		double compound = (p*Math.pow(1+(r/n),k)) - p;
		System.out.println(compound);
	}
}

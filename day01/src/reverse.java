
public class reverse {
	public static void main(String[] args) {
		int number=9876;
		int reverse=0;
		int k;
		while(number!=0){
			reverse = reverse*10;
			k = number%10;
			number = number/10;
			reverse = reverse+k;
		}
		System.out.println(reverse);
	}

}


public class largest {
	public static void main(String[] args) {
		int x=2;
		int y=4;
		int z=6;
		int result = 1;
		if(x>y && x>z){
			result = x;
		}
		if(y>x && y>z){
			result = y;
		}
		if(z>x && z>y){
			result = z;
		}
		System.out.println(result);
	}
}

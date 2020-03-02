import java.io.InputStream;
import java.util.Scanner;


public class complex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r1;
		int r2;
		int r3;
		
		int i1;
		int i2;
		int i3;
		
		System.out.println("Enter real part of first complex number");
		r1 = sc.nextInt();
		System.out.println("Enter imaginary part of first complex number");
		i1 = sc.nextInt();
		
		System.out.println("Enter real part of second complex number");
		r2 = sc.nextInt();
		System.out.println("Enter imaginary part of second complex number");
		i2 = sc.nextInt();
		r3 = r1+r2;
		i3 = i1+i2;
		
		System.out.println(r1+" + "+i1+"i");
		System.out.println(r2+" + "+i2+"i");
		System.out.println("--------------");
		
		System.out.println(r3+" + "+i3+"i");
	}
}

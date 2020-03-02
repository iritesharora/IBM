package day5;

import java.util.Scanner;

public class User {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=null,email_Id=null,password=null;
		int age;
		Scanner sc=new Scanner(System.in);
		//name=sc.nextLine();
		System.out.println("Enter Mail ID: ");
		email_Id=sc.nextLine();
		System.out.println("Enter Passsword: ");
		password=sc.nextLine();
		Bl b=new Bl();
		b.validation(email_Id,password);
		
		
		

	}

}

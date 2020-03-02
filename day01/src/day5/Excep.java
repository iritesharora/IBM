package day5;

import java.io.FileNotFoundException;

public class Excep {
	public static void main(String[] args) {
		 int age=20;
			
			try{
				if(age<18)
				{
					throw new Exception("Invalid age");
				}
				else{
					System.out.println("valid age");
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			try {
				throw new FileNotFoundException("Invalid age");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}

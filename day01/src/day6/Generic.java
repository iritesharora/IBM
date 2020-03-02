package day6;

import java.util.ArrayList;

public class Generic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Integer> a=new ArrayList<Integer>();
      a.add(90);
      a.add(30);
      show(a);
	}

	private static void show(ArrayList a) {
		// TODO Auto-generated method stub
		a.add("abc");
		a.add(new Float(90.0f));
		a.add("hvvqw");
		System.out.println("list is: "+a);
	}

}

package day6;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	/**
	 * @param <E>
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		Party p=new Party();
		p.addname("ritesh",a);
		p.addname("jatin",a);
		p.addname("shubham",a);
		p.addname("suraj",a);
		p.show(a);
		System.out.println("after searching");
		p.searchname("ritesh",a);
		p.sort(a);
		System.out.println("After Sorting");
		p.show(a);

}
}

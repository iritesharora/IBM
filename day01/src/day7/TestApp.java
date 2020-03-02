package day7;

import java.util.ArrayList;
import java.util.List;

public class TestApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		consumer c=new consumer(list);
		Producer p=new Producer(list);
		Thread t1=new Thread(c);
		Thread t2=new Thread(p);
		t1.start();
		t2.start();

	}

}

package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Party {
    ArrayList a=new ArrayList();
	void addname(String ar,ArrayList a)
	{
		a.add(ar);
	}
	void show(ArrayList a)
	{
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	public void searchname(String s,ArrayList a) {
		// TODO Auto-generated method stub
		System.out.println(a.contains(s));;
		
	}
	public void sort(ArrayList a) {
		// TODO Auto-generated method stub
		Collections.sort(a);
		
	}
}

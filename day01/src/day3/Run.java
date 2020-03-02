package day3;

 class Inherit {
	 String name="abc";
  void show()
 {
	 System.out.println("parent class");
 }
 
}
class Derived extends Inherit{
	String name="xyz";
	void show()
	 {
		 System.out.println("derived class");
	 }
	void display()
	{
		System.out.println("derived class");
	}
}
public class Run{
	public static void main(String[] args) {
		Inherit i=new Derived();
		//Derived d=new Derived();
	i.show();
	//i.dispaly();
	System.out.println(i.name);
	}
}

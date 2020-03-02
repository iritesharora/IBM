package day2;

public class Demo {
	private String name;
	private int uid;
	private String address;
	private int age;
	 
	public void show()
	{
		System.out.println("Name is: "+name);
		System.out.println("Uid is: "+uid);
		System.out.println("Address is: "+address);
		System.out.println("Age is: "+age);
	}
	public void update(String name,int uid,String address,int age)
	{
		this.name=name;
		this.uid=uid;
		this.address=address;
		this.age=age;
	}
	public String toString() {
		return "Demo [name=" + name + ", uid=" + uid + ", address=" + address
				+ ", age=" + age + "]";
	}
	

}

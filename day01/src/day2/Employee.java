package day2;

public class Employee {

	String name;
	int year;
	 int salary;
	String address;
	 String dept;
	public Employee(String name,int year,int salary,String dept)
	{
		this.name=name;
		this.year=year;
		this.salary=salary;
		this.dept=dept;
	}
	public Employee(String name,int year,int salary,String address,String dept)
	{
		this(name, year, salary,dept);
		this.address=address;
		
	}
	public String toString() {
		return " " + name + "     " + year + "     "
				+ salary + "     " + address + "               "+ dept+"";
	}
	
	
}

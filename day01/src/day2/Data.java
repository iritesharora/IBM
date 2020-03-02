package day2;

public class Data {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bonus = 0;
Employee e3=new Employee("suraj",1990,456,"HR","IT");
  Employee e1=new Employee("ritesh",1998,36478,"IT");
  Employee e2=new Employee("jatin",1990,57899,"UK","HR");
  System.out.println(e1);
  System.out.println(e2);
  System.out.println(e3);
  if(e1.dept.equals("IT"))
  {
	   bonus=e1.salary*5/100;
	   System.out.println("bonus for employee e1 is: "+bonus);
  }
  if(e2.dept.equals("HR"))
  {
	   bonus=e2.salary*5/100;
	   System.out.println("bonus for employee e2 is: "+bonus);
  }
  if(e3.dept.equals("IT"))
  {
	   bonus=e3.salary*5/100;
	   System.out.println("bonus for employee e3 is: "+bonus);
  }
  
	}

}

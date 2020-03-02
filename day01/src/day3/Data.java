package day3;

public class Data {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d=new Department();
		d.setDeptname("IT");
		d.setEmployee(new Employee[5]);
		d.getEmployee()[0]=new Employee("Ritesh",21,58758,new Address("HP"));
		System.out.println(d.getEmployee()[0]);
		

	}

}

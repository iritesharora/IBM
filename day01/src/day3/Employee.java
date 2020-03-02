package day3;

import java.sql.Date;

public class Employee {
String name;
int age;
String gender;
Long salary;
Address address;
Date date_of_join;



public Employee(String name, int age, String gender, Long salary,
Address address, Date date_of_join) {
super();
this.name = name;
this.age = age;
this.gender = gender;
this.salary = salary;
this.address = address;
this.date_of_join = date_of_join;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public int getAge() {
return age;
}

public void setAge(int age) {
this.age = age;
}

public String getGender() {
return gender;
}

public void setGender(String gender) {
this.gender = gender;
}

public Long getSalary() {
return salary;
}

public void setSalary(Long salary) {
this.salary = salary;
}

public Address getAddress() {
return address;
}

public void setAddress(Address address) {
this.address = address;
}

public Date getDate_of_join() {
return date_of_join;
}

public void setDate_of_join(Date date_of_join) {
this.date_of_join = date_of_join;
}

@Override
public String toString() {
return "Employee [name=" + name + ", age=" + age + ", gender=" + gender
+ ", salary=" + salary + ", address=" + address
+ ", date_of_join=" + date_of_join + "]";
}

}

package day5;

import java.util.Arrays;

public class Department {
String name;
Employee[] e = new Employee[2];

public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public Employee[] getE() {
return e;
}
public void setE(Employee[] e) {
this.e = e;
}
@Override
public String toString() {
return "Department [name=" + name + ", e=" + Arrays.toString(e) + "]";
}



}
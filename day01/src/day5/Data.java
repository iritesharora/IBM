package day5;

public class Data {
public static void main(String[] args) {
Department d = new Department();
d.setName("IT");
d.getE()[0] = new Employee("jatin", 23, "M", (long) 12000, new Address("Delhi", "Delhi", "India"),2015);
d.getE()[1] = new Employee("Ritesh", 21, "M", (long) 70000, new Address("Tokyo", "Tokyo", "Japan"),2017);

for(int i=0;i<2;i++){
System.out.println(d.e[i]);
}
for(int i=0;i<2;i++){
long bonus = d.e[i].getSalary()*2/100;
d.e[i].setSalary(bonus);
System.out.println(d.e[i].getSalary());
if(d.e[i].getAddress().getCountry().equals("India")){
continue;
}
if(d.e[i].getGender().equals("M")){
bonus = d.e[i].getSalary()*10/100;
bonus = bonus+d.e[i].getSalary();
d.e[i].setSalary(bonus);
}
if(d.e[i].getGender().equals("F")){
bonus = d.e[i].getSalary()*12/100;
bonus = bonus+d.e[i].getSalary();
d.e[i].setSalary(bonus);
}
}

for(int i=0;i<2;i++){
System.out.println(d.e[i]);
}
System.out.println();
System.out.println("Security");

Department sec = new Department();
sec.setName("Security");
sec.getE()[0] = new Employee("abc", 20, "M", (long) 7000, new Address("Pune", "maharastra", "India"),2001 );
sec.getE()[1] = new Employee("Miley", 27, "F", (long) 13000, new Address("Bangalore", "Karnataka", "India"),2005 );

for(int i=0;i<2;i++){
System.out.println(sec.e[i]);
}
for(int i=0;i<2;i++){
long bonus = d.e[i].getSalary()*3/100;
bonus = bonus+d.e[i].getSalary();
d.e[i].setSalary(bonus);

if(d.e[i].getAddress().getCountry().equals("India")){
continue;
}
if(d.e[i].getGender().equals("M")){
bonus = d.e[i].getSalary()*10/100;
bonus = bonus+d.e[i].getSalary();
d.e[i].setSalary(bonus);
}
if(d.e[i].getGender().equals("F")){
bonus = d.e[i].getSalary()*12/100;
bonus = bonus+d.e[i].getSalary();
d.e[i].setSalary(bonus);
}
}
for(int i=0;i<2;i++){
System.out.println(d.e[i]);
}

System.out.println();
System.out.println("HR");

Department hr = new Department();
hr.setName("HR");
hr.getE()[0] = new Employee("bhjk", 21, "M", (long) 11000, new Address("Kanpur", "UP", "India"),2001 );
hr.getE()[1] = new Employee("dfg", 22, "F", (long) 9000, new Address("Bangalore", "Karnataka", "India"),2005 );

for(int i=0;i<2;i++){
System.out.println(sec.e[i]);
}
for(int i=0;i<2;i++){
long bonus;
if(d.e[i].getAddress().getCountry().equals("India")){
continue;
}
if(d.e[i].getGender().equals("M")){
bonus = d.e[i].getSalary()*10/100;
bonus = bonus+d.e[i].getSalary();
d.e[i].setSalary(bonus);
}
if(d.e[i].getGender().equals("F")){
bonus = d.e[i].getSalary()*12/100;
bonus = bonus+d.e[i].getSalary();
d.e[i].setSalary(bonus);
}
}
for(int i=0;i<2;i++){
System.out.println(d.e[i]);
}
}
}




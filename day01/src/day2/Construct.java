package day2;

public class Construct {
int uid;
String name;
int age;
Construct(String name,int age)
{
	this(1064,name,age);
	

}
Construct(int uid,String name)
{
	this(uid,name,21);
}
Construct(int uid)
{
	this(uid,"bikb");
	
}
Construct(int uid,String name,int age)
{
	this.uid=uid;
	this.name=name;
	this.age=age;
	System.out.println(uid+","+name+","+age);
}
}

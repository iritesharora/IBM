package day3;

class Grandparent {
private String fname;
private String mname;
private String lname;
Grandparent(String fname,String mname,String lname)
{
	this.fname=fname;
	this.mname=mname;
	this.lname=lname;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getMname() {
	return mname;
}
public void setMname(String mname) {
	this.mname = mname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String toString() {
	return "Grandparent [fname=" + fname + ", mname=" + mname + ", lname="
			+ lname + "]";
}

}
class Parent extends Grandparent
{
	Parent(String fname, String mname, String lname) {
		super(fname, mname, lname);
		// TODO Auto-generated constructor stub
	}
	String fname;
	String mname;
	String lname;
}

package Staticvariablemethod;

class Staticvariablemethod1 {
int eid;
String ename;
double salary;

//created static variable
static String companyname="wipro";
//static method 
//static void change to change the company name
static void change() {
companyname="google";
}
//created a constructor
Staticvariablemethod1(int eid ,String ename,double salary){
	this.eid=eid;
	this.ename=ename;
	this.salary=salary;
}
void display() {
	System.out.println(eid+" "+ename+" "+salary+" "+companyname);
}
public class Staticvariablemethod {
	public static void main(String[]args) {
		//calling static method
		Staticvariablemethod1. change();
		//created a object
		Staticvariablemethod1 a=new Staticvariablemethod1(1001,"sumit",29000);
		Staticvariablemethod1 b=new Staticvariablemethod1(1002,"rahul",25999);
		a.display();
		b.display();
	}
}
}

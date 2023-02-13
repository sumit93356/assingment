package Inheritence.com;

class Egsingle1 {
String name;
int rollno;
int sem;
void input() {
	name="sandeep ";
	rollno=101;
	sem=5;
	}
class result extends Egsingle1{
	public void show() {
		System.out.println("Name"+name);
		System.out.println("rollno"+rollno);
		System.out.println("sem"+sem);
	}
	
}
class Egsingle{
	public static void main(String[]args) {
	result object=new result();
	object.input();
	object.show();
		
		
	}
}
	

}


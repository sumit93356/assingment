package Super.com;
class Mathmatic{
	int a;
	int b;
	 Mathmatic(int a,int b){
		 this.a=a;
		 this.b=b;
	 }
}
class Add extends  Mathmatic{
	int c=a+b;
	int c1=a-b;
	int c2=a*b;
	int c3=a/b;
	Add(int a, int b){
		super(a, b);
		
	}
	void print() {
		System.out.println("the sum of two number is "+c);
		System.out.println("the subtraction of two number is "+c1);
		System.out.println("the multiple of two number is "+c2);
		System.out.println("the divide of two number is "+c3);
	}
}

public class Eg_Super_2 {

	public static void main(String[] args) {
		Add a=new Add(10,12);
		a.print();

	}

}

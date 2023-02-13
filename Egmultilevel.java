package Inheritence.com;

 class SIparent {
     String School="KV";
     void show() {
    	 System.out.println("School"+School);
     }
 }
  class SIchild2 extends SIparent{
	  int code=501;
	  void code() {
		  System.out.println("code "+code);
	  }
  }
  class SIchild3 extends SIchild2{
	  String school1=School+code;
	  void print() {
		  System.out.println("School details"+" "+school1);
	  }
  }
  public class Egmultilevel{
	  public static void main(String[]args) {
		  SIchild3 object=new SIchild3();
		  
		  object.print();
	  }
  }
 
 

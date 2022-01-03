package Constatnts;

abstract class Bike2{  
	   Bike2(){
		   System.out.println("bike is created");
		   }  
	   abstract void run();  
	   void changeGear(){
		   System.out.println("gear changed");
	   }  
	 }  
	//Creating a Child class which inherits Abstract class  
	 class Honda extends Bike2{  
	 void run(){System.out.println("running safely..");
	 }  
	 }  
	//Creating a Test class which calls abstract and non-abstract methods  
	 class Abstratctnewclass{  
	 public static void main(String args[]){  
	  Bike2 obj = new Honda();  
	  obj.run();  
	  obj.changeGear();  
	 }  
	}
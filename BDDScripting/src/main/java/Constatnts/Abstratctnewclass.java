package Constatnts;

abstract class Bike2{  
	
	static {
		System.out.println("Static block");
	}
	   Bike2(){
		   System.out.println("Const");
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
	  Honda obj1 = new Honda(); 
	  obj.run();  
	  obj.changeGear();    
	 }  
	}
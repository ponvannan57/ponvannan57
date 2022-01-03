package Constatnts;

class ride{  
	  void run(){
		  System.out.println("running");
	  }  
	}  


	class Splendor extends ride{  
	  void run(){
		  System.out.println("running safely with 60km");
	  }
	}
	  
	 class runtimepoly{
	  
	  public static void main(String args[]){  
		  Splendor b = new Splendor();//upcasting  
	    b.run();  
	    ride b1 = new ride();
	    b1.run();
	  } 
	  }
	   
	
package Mainclass;

public class samplejava extends sample2{
	
	public void method3() {
		System.out.println("Mehtod3");
		
	}
	
	
	
	public static void method1() {
		System.out.println("Mehtod1");
		
		int a=4,b=34,c=89,d=890;
		
		System.out.println("The Header is: "+Math.max(Math.max(Math.max(a, b),c),d));
		
	}
	
	private static void method5() {
		System.out.println("Mehtod5");
		
	}

	public static void main(String[] args) {
		
		sample2 obj = new sample2();
		samplejava sp = new samplejava();
		
		method1();
		method2();
		sp.method3();
		method4();
		method5();
		// TODO Auto-generated method stub

	}

}

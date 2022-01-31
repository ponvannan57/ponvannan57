package Handson;

public class greatestint {

	public static void main(String[] args) {
		int I = 85952148;
		int Num =I;
		int Max = Integer.MIN_VALUE;
		while(Num!=0) {
			int R = Num%10;
			 if(R>Max) {
				 Max=R;
			 }
			 
			 Num = Num/10;
		}
		
		System.out.println(Max);
	}

}

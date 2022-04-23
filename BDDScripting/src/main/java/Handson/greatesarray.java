package Handson;

public class greatesarray {

	public static void main(String[] args) {
		
		int[] A = {122,120,1,3,88,65,99,121,13};
		
		int Max = A[0];
		int Smax=Integer.MIN_VALUE;
		
		for(int i=1;i<A.length;i++) {
			
			if(A[i]>Max) {
				
				Smax=Max;
				Max=A[i];
				
			}
			
			else if(A[i]<Max && A[i] > Smax){
				
				Smax=A[i];
				
			}
			
		}

		System.out.println(Max);
		System.out.println(Smax);
	}

}

package Constatnts;

public class replacestring {

	public static void main(String[] args) {
		
		String Text ="The Xext To Be Replaced";
		
		StringBuffer SB = new StringBuffer(Text);
		//SB.reverse();
		SB.append("1234");
		System.out.println(SB);
		
		String S1 = new String("1234");
		String S2 = "1234";
		System.out.println(S1.equals(S2));
		String S4="";
		int S5=1234;
		String S6 = S4+ S5;
		System.out.println(S6);
		
	
		
		int index = 4;
		
		char c= 'T';
		
		Text = Text.substring(0, index) + c + Text.substring(index+1);
		
		System.out.println(Text);
		
	}

}

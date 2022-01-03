package Constatnts;

public class replacestring {

	public static void main(String[] args) {
		
		String Text ="The Xext To Be Replaced";
		
		int index = 4;
		
		char c= 'T';
		
		Text = Text.substring(0, index) + c + Text.substring(index+1);
		
		System.out.println(Text);
		
	}

}

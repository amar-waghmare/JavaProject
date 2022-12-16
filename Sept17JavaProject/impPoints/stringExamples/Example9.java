package stringExamples;

public class Example9 {

	public static void main(String[] args) {
		
		String s1 = "Harry Potter";
		String s = "";
		
		int l = s1.length();
		
		for(int i=l-1;i>=0;i--)
		{
			char b = s1.charAt(i);
			s = s + b;
			
		}
		System.out.println(s);
	
	}

}

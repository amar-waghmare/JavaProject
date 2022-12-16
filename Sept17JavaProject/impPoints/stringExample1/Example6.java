package stringExample1;

public class Example6 {

	public static void main(String[] args) {
		
		
		String s3="Harry James aPotter";
		
		String a = s3.replaceFirst("is", "was");
		System.out.println(a);
		
		String[] b = s3.split("James");
		System.out.println(b);
		
		
		int l = b.length;
		
		for(int i=0;i<l;i++)
		{
			System.out.println(b[i]);
		}
		
		String[] c = s3.split("a", 8);
		int cl =c.length;
		
		for(int i=0;i<cl;i++)
		{
			System.out.println(c[i]);
		}
	}

}

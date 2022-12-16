package loopStatement1;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1234569;
		int o_num=num;
		int rem;
		int x=0;
		
		while(num>0)
		{
			rem = num%10;
			x = x*10+rem;
			num = num/10;
		}
		
		System.out.print(x);
	}
}

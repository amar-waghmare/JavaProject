package loopStatements;

public class CountOfDigit {

	public static void main(String[] args) {

		int num=852096;
		int count = 0;
		for(int i=1;num>0;i++)
		{
			num= num/10;   // num = 85209 ,  8520 ,852 , 85 8 0 
			count++;      // 1 2 3 4 5 6
		}
		System.out.println(count);
	}
}

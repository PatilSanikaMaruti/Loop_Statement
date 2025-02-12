import java.util.Scanner;
class MinFreqofDigitInNum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		long num=sc.nextInt();

		int dgt=0;
		int min=9;
		for(int i=0;i<=9;i++)
		{
			int cnt=0;
			for(long j=num;j>0;j/=10)
			{
				long rem=j%10;
				if(i==rem)
				{
					cnt++;
				}
			}
			if(cnt!=0)
			{
				if(min>cnt)
				{
					min=cnt;
					dgt=i;
				}
			}
		}
		System.out.println("Min digit is " +dgt + " with a frequency of " +min);
	}
}
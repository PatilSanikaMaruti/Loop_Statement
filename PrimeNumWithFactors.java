import java.util.Scanner;
class PrimeNumWithFactors
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		int cnt=0;

		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				cnt++;
			}
		}

		System.out.println(cnt==0?"Prime Number":"Not Prime Number");
		System.out.println("Count:" +cnt);

	}
}
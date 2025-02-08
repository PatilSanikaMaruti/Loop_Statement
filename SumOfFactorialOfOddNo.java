import java.util.Scanner;
class SumOfFactorialOfOddNo
{
	public static void main(String[] args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=ab.nextInt();
		int sum=0;

		while(num>0)
		{
			int rem=num%10;
			if(rem%2==1)
			{
				int fact=1;	
				for(int i=rem;i>=1;i--)
				{
					fact*=i;
				}
				sum+=fact;
			}
			num/=10;
		}
		System.out.println("Sum of Fatorial of Odd Digit of Entered Number is " +sum);
	}
}
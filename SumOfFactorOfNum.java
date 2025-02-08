import java.util.Scanner;
class SumOfFactorOfNum
{
	public static void main(String[] args)
	{
		Scanner ac=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=ac.nextInt();
		int sum=0;
		int i;
		for( i=1;i<=num;i++)
		{
			if(num%i==0)
		
			System.out.print(i +" " );
		
		sum+=i;
		}
	System.out.println(sum);

	}
}
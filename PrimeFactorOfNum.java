import java.util.Scanner;
class PrimeFactorOfNum
{
	public static void main(String[] args)
	{
	Scanner ac=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int num=ac.nextInt();
	int i;

	for(i=2;i<=num;i++)
	{
		if(num%i==0)
		{
			System.out.println((i==2||i==3)?(i+" is prime"):((i%2==0||i%3==0)?(i+" is not prime"):(i + " is prime")));
		}
		
	}
	}
}
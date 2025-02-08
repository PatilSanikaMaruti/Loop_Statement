import java.util.Scanner;
class ProductOfFactorOfNum
{
	public static void main(String[] args)
	{
		Scanner ac=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=ac.nextInt();
		int product=1;
		int i;
		for( i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.print(i +" " );
				product*=i;
			}
		}
		System.out.println();
		System.out.println("Product of Factors of a number:" +product);
	}
}
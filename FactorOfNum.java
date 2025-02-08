import java.util.Scanner;
class FactorOfNum
{
	public static void main(String[] args)
	{
	Scanner ac=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int num=ac.nextInt();
	for(int i=1;i<=num;i++)
	{
		if(num%i==0)
		{
			System.out.print(i +" " );
		}
	
	}
}
}
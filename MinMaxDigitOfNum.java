import java.util.Scanner;
class MinMaxDigitOfNum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int min=9;
		int max=0;

		for(int i=num;i>0;i/=10)
		{
			int dgt=i%10;
			if(min>dgt)
			{
				min=dgt;
			}
			
			else if(max<dgt)
			{
				max=dgt;
			}
		}
		System.out.println("Smallest digit from " +num +" is " +min);
		
		System.out.println("Largest digit from " +num +" is " +max);
	}
}
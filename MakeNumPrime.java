import java.util.Scanner;
class MakeNumPrime
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		boolean flag=true;
		int dup=num;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=false;
				num++;
				i=2;
			}
		}
		System.out.println("Entered  number is "+dup);
		System.out.println("Made prime number is "+num);
		
	}
}
	
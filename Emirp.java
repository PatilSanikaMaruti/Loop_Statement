import java.util.Scanner;
class Emirp
{
	public static void main(String[] args)
	{
		Scanner ac=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=ac.nextInt();
		int dup=num;
		boolean flag1=true;
		int rev=0;

		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag1=false;
				break;
			}
			else
			{
				flag1=true;
				break;
			}
		
		}
		while(dup>0)
		{
			int rem=dup%10;
			rev=rev*10+rem;
			dup/=10;
		}
		System.out.println(rev);

		boolean flag2=true;
		for(int i=2;i<rev;i++)
		{
			if(rev%i==0)
			{
				flag2=false;
				break;
			}
		else
		{
			flag2=true;
			break;
		}
		
	}
		if(flag1==flag2)
		{
			System.out.println("Number is Emirp");	
		}
		else
		{	
			System.out.println("Number is not Emirp");
		}
	}
}

	


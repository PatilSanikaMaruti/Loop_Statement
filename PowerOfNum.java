import java.util.Scanner;
class PowerOfNum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		System.out.println("Enter the Power:");
		int power=sc.nextInt();
		int op=1;

		for(int i=1;i<=power;i++)
		op*=num;

		System.out.println(num+"^" +power+ "=" +op);
		//System.out.println(num+"^" +power+ "=" +(int)(Math.pow(num,power)));    This is a math function of power
	}
}


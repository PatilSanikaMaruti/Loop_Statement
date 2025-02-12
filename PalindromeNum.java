import java.util.Scanner;
class PalindromeNum
{
	public static void main(String[] args)
	{
		Scanner as=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=as.nextInt();
		int rev=0;
		int dup=num;

		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if(rev==dup)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is Not Palindrome");
		}
	}
}

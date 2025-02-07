import java.util.Scanner;
class ProductOfDigits
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter integer between 0 and 1000:");
		int num=sc.nextInt();
		int product=1;
		
		while(num!=0)
		{
			product=product*(num%10);
			num=num/10;		
		}
		System.out.println("Product Of Digits:"+product);	
	}
}

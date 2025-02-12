import java.util.Scanner;
class PalindromString
{
	public static void main(String[] args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=ab.nextLine();

		
		StringBuffer rev=new StringBuffer(str);
		rev.reverse();

		if(str.equals(rev.toString()))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");
		
	}
}
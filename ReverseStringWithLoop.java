import java.util.Scanner;
class ReverseStringWithLoop
{
	public static void main(String[] args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=ab.nextLine();
		String rev="";

		for(int i=0;i<str.length();i++)
			rev=str.charAt(i)+rev;
		System.out.println("Reverse of " +str +" is " +rev);
	}
}

//OR
//public static void main(String[] args)
//{
//	String rev1="";
//	for(int i=str.length()-1;i>=0;i--)
//		rev1=rev1+str.charAt(i);
//	System.out.println(rev1);
//}
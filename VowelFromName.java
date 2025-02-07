import java.util.Scanner;
class VowelFromName
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name:");
		String name=sc.nextLine();
		System.out.println();

		char ch;
		int length=name.length();
		
		System.out.println("Vowels of "+name+":");
		
		for(char i=0;i<length;i++)
		{
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'|| name.charAt(i)=='A'||name.charAt(i)=='E'||name.charAt(i)=='I'||name.charAt(i)=='O'||name.charAt(i)=='U')
			{
				 ch=(name.charAt(i));
				 System.out.print(ch+",");
			}
		}
		System.out.println();
	}
}
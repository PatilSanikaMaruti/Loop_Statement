class ForAscii
{
	public static void main(String[] args)
	{
		System.out.println("ASCII value from 0 to 127:");
		for(int i=0;i<=127;i++)
		{
			System.out.println(i+ " "+(char) i);
		}
		System.out.println();
		System.out.println();
		System.out.println("1 to 10 number:");
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");			
		}
		System.out.println();
		System.out.println();
		System.out.println("z to a alphabet:");
		for(char i='z';i>='a';i--)
		{
			System.out.print(i+" ");			
		}
		System.out.println();
		System.out.println();
		System.out.println("A to Z alphabet:");
		for(char i='A';i<='Z';i++)
		{
			System.out.print(i + " ");			
		}
		System.out.println();
		System.out.println();
		System.out.println("0 to 9 Digit:");
		for(char i='0';i<='9';i++)
		{
			System.out.print(i+" ");			
		}

	}
}
class pattern16
{
	public static void main(String args[])
	{int a=65;
		for(int i=4;i>=0;i--)
		{
			for(int j=i-1;j>=0;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=4-i;k++)
			{
				System.out.print((char)(a+i)+" ");
			}
			System.out.println();
		}
	}
}


/*  OUTPUT


    E
   D D
  C C C
 B B B B
A A A A A

*/
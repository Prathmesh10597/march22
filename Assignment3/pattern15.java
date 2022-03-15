class pattern15
{
	public static void main(String args[])
	{int a=65;
		for(int i=0;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print((char)(a+k)+" ");
			}
			System.out.println();
		}
	}
}


/*  OUTPUT


    A
   A B
  A B C
 A B C D
A B C D E


import java.util.Scanner;
class Q15
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number n1 =");
		int n1=sc.nextInt();
		
		System.out.println("Enter first number n2 =");
		int n2=sc.nextInt();
		
		int temp=n1;
		n1=n2;
		n2=temp;
		
		System.out.println("First number n1 ="+n1);
		System.out.println("Second number n2 ="+n2);
	}
}
		
		
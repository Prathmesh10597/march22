import java.util.Scanner;
class Q13
{
		public static void main(String args[])
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the width of rectangle =");
			float w=sc.nextFloat();
			
			System.out.println("Enter the feight of rectangle =");
			float h=sc.nextFloat();
			
			float a=w*h;
			float p=2*(w+h);
			
			System.out.println("Area ="+a);
			System.out.println("Perimeter ="+p);
			
		}
}

import java.util.Scanner;
class Q12
{
		public static void main(String args[])
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the FIrst number n1=");
			int n1= sc.nextInt();
			
			System.out.println("Enter the Second number n2=");
			int n2= sc.nextInt();
			
			System.out.println("Enter the Third number n3=");
			int n3= sc.nextInt();
			
			double k=(n1+n2+n3)/3;
			
			System.out.println("Average of three numbers is ="+k);
			
		}
}
			
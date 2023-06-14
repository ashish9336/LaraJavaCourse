import java.util.Scanner;
class H 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter first number ");
		Scanner sc = new Scanner(System.in);
		int value1 = sc.nextInt();
		System.out.println("first value : " + value1);
		System.out.println("Please enter Second number ");
		Scanner sc1 = new Scanner(System.in);
		int value2 = sc1.nextInt();
		System.out.println("Second value : " + value2);
		System.out.println("Please enter third number ");
		Scanner sc2 = new Scanner(System.in);
		int value3 = sc2.nextInt();
		System.out.println("sume three  value : " +( value1+value2+value3));
		
	}
}

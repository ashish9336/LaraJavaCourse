import java.util.Scanner;
class I  
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter first Roll_number ");
		Scanner sc = new Scanner(System.in);	
		int r1 = sc.nextInt();
		System.out.println("Roll_number : " + r1);

        System.out.println("Please enter Name ");
		//Scanner sc = new Scanner(System.in);	
		String n1 = sc.next();
		System.out.println("name : " + n1);

        System.out.println("Please enter Age ");
		//Scanner sc = new Scanner(System.in);	
		int Ag1 = sc.nextInt();
		System.out.println("Age : " + Ag1);
        
		 System.out.println("Please enter Course ");
		//Scanner sc = new Scanner(System.in);	
		String co1 = sc.next();
		System.out.println("Course : " + co1);
        
		System.out.println("Please enter Skill ");
		//Scanner sc = new Scanner(System.in);	
		String sk = sc.next();
		System.out.println("Skill : " + sk);

       System.out.println("Please enter fees ");
	//	Scanner sc = new Scanner(System.in);	
		double fe = sc.nextDouble();
		System.out.println("Fees : " + fe);

       System.out.println("Please enter joboffer  ");
		//Scanner sc = new Scanner(System.in);	
		 boolean b1= sc.nextBoolean();

		System.out.println("joboffer : " + b1);

      System.out.println("Details student  : " +( r1 +","+ ","+ n1 + Ag1 + co1 + sk + fe + b1));





		}
}
//next().charAt(0)
class J2

{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 1; i <= 10; i++)
		{
				System.out.println("outer loop begin:" +i);
			{
				for(int j = 101; j <= 105; j++)
				{
				System.out.println("main begin:" +i + "," + j);
				System.out.println("main begin:" +i + "," + j);
				}
				System.out.println("outer loop end:" +i);
				}
		
		}
			System.out.println("main end:");
	}
}
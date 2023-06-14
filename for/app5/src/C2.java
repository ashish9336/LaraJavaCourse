class C2 
{
	public static void main(String[] args) 
	{
		System.out.println("main being");
		for(int i = 1; i <= 10; i++)
		{
				System.out.println("main being:" + i);
				if(i == 4)
			{
				continue;
			}
           System.out.println("main end:" + i);
		}
	           System.out.println("main end:");
	}
}

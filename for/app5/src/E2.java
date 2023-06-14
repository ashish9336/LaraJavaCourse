class E2

{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 1; i <= 10; i++)
		{
				System.out.println("main begin:" +i);
				if(i <= 4)
			{
				System.out.println("if begin");
				continue;

			}
		System.out.println("main end:" + i);
		}
			System.out.println("main end:");
	}
}

class V 
{
	public static void main(String[] args) 
	{
		loop1:
		for(int i = 0; i < 3; i++)
		System.out.println("loop1 begin");
		for(int j = 0; j <= 3; j++)
		{
		System.out.println("loop2 begin");
		if(j > 2)
			{
			continue loop1;
			}
			System.out.println("loop2 end");
	}
System.out.println("loop1 end");
}
}
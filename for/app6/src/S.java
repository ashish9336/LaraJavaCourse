class S

{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 0;
		do
		{
		
		System.out.println("Body:" + i);
		i++;
		}
		
		
		while ((i++ == 1) || (i++ == 2));     //body
		System.out.println("main end");
	}
}

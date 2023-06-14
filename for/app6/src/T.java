class T

{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 0;
		do
		{
		
		System.out.println("Body:" + i);
		i++;
		if(i > 3)
			{
			continue;
			}
		System.out.println(" end: " + i);		
		}
		while (i < 10);     //body
		//System.out.println("main end");
	}
}

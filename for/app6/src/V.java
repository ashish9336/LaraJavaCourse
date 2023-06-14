class V

{
	public static void main(String[] args) 
	{
		//System.out.println("main begin");
		int i = 0;
		do //outer loop
		{
		
		System.out.println(" loop1 begin:" + i);
		int j = 0;
		do
		{                                  // this is inner loop
		System.out.println(" loop2 begin:" + j);
		j++;
		System.out.println(" loop2 end:" + j);
		}
		while (j < 2);
		i++;
			
		System.out.println(" loop1 end:" + i);		
		}
		while (i < 3);     //body
		//System.out.println("main end");
	}
}

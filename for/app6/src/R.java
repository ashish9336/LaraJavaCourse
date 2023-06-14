class R

{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 0;
		do
		{
		i++;
		System.out.println("Body:" + i);
		if(i == 20)
			{
				break;
			}
		}
		while (i < 10);     //body
		System.out.println("main end");
	}
}

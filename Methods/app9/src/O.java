class O 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(true)
		{
		System.out.println("from if begin");
		return;                              //unreachable statement
		System.out.println("from if end");
		}
			System.out.println("main end");
	}
}

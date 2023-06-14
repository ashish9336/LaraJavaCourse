class F 
{
	public static void main(String[] args) 
	{
		int i = 10;  
		switch(i)
		{
			default:
				System.out.println("from default"); // include next because no break
			case 2:                             
			System.out.println("from case 2");
			break;
			case 3:
			System.out.println("from case 3"); 
			break;
			case 5:
			break;
		}	System.out.println("main end");
	}
}

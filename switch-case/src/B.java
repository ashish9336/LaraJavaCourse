class B 
{
	public static void main(String[] args) 
	{
		int i = 3;
		switch(i)
		{
			case 2:
				System.out.println("from case 2");
			case 3:
			System.out.println("from case 5"); // no break so fo flow will continue
			case 5:
		}	System.out.println("from case 3");
	}
}

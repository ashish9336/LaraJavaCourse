class EEE 
{
	public static void main(String[] args) 
	{
	boolean[] x = { true, false, false ,false};
	int [] y = { 10, 20,30,40};
	loop1:
		for(int j : y)
		{
		for(boolean i : x)
			{
			if(i == false)
				{
				continue loop1;
				}
				else
				{
				System.out.println(i);

			}

		System.out.println(j);
	}
}
	}}
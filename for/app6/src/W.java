class 

{
	public static void main(String[] args) 
	{
	  int i = 0;
		do //outer loop
		{
		System.out.println(" loop1 begin:" + i);
		int j = 0;
		do
		{                                  // this is inner loop
		System.out.println(" loop2 begin:" + j);
		j++;
		if(j > 1);
			{
		continue;		
			}
	System.out.println(" loop2 end:" + j);		
		}
		while (i < 2); 
		i++;//body
		System.out.println(" loop2 end:" + i);	
	}
	while (i < 3); 
		i++;//body
		System.out.println(" loop3 end:" + i);	
	}
	
	}

class XXX
{
	public static void main(String[] args) 
	{
	  int i = 0;
	  loop1:
		do //outer loop
		{
		System.out.println(" loop1 begin:" + i);
		int j = 0;
		i++;
		do
		{                                  // this is inner loop
		System.out.println(" loop2 begin:" + j);
		j++;
		if(j > 1)
			{
		break loop1;		
			}
	System.out.println(" loop2 end:" + j);		
		}
		while (j < 100); 
		i++;//body
		System.out.println(" loop2 end:" + i);	
	}
	while (i < 3);
		//System.out.println(" loop3 end:" + i);	
	}
	
	}

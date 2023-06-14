class P 
{
	public static void main(String[] args) 
	{
	int i;
	for(i =0, System.out.println("INITIALIZER");//only one
	i < 5;                                      //i=0,
	i++, System.out.println("INCREMENT"))
		{
		System.out.println("BODY");
		}
	}
}
/*
INITIALIZER
BODY -0
INCREMENT-1
BODY -1
INCREMENT-2



*/
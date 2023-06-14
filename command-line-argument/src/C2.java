class C2 
{
	public static void main(String[] args) 
	{
		System.out.println("total arguments:" + args.length);
		for(String elemets : args)
		{
		System.out.println(elemets);
		}
	int i = Integer.parseInt(args[0]);
	int j = Integer.parseInt(args[1]);
	System.out.println(i);
	System.out.println(j);
	}
}

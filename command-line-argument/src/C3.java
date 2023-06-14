class C3 
{
	public static void main(String[] args) 
	{
		System.out.println("total arguments:" + args.length);
	 
		for(String elemets : args)
		{
		System.out.println(elemets);
		}
	 double i = Double.parseDouble(args[0]);
	double j = Double.parseDouble(args[1]);
	System.out.println(i);
	System.out.println(j);
	}
}

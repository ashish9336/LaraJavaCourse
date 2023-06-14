class C6 
{
	public static void main(String[] args) 
	{
		System.out.println("total arguments:" + args.length);
		System.out.println("--------------------------------");
		//its not converting from string to char
		//its just fetching values from a particular string index
		//we cant convert string to char
		char c1 = args[0].charAt(0);
		System.out.println(c1);
	}
}
//internally strung are also array of characters, and will be having index. index starts from 0.
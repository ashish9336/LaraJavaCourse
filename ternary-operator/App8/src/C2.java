class C2 
{
	public static void main(String[] args) 
	{
		int i = 1;
		i = (i++ == 1 && i++ == 3) ? 10 : 20;
		System.out.println(i);
	}
}

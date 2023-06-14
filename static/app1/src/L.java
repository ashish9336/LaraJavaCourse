class L 
{
	static boolean m;
	public static void main(String[] args) 
	{
		boolean m = true;
		System.out.println(L.m);//global  class name  call by L reference
		System.out.println(m); // this is locol value;
	}
}

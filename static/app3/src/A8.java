class A8 
{
static int i;
static
	{
	System.out.println("SIB from A");
	}
	static
	{
	System.out.println("SIB2 from A");
	}
}
class P6
{

	 static
	{
		//System.out.println("main" + i);
		System.out.println("SIB from p6");
	}
	public static void main(String[] args)
	{
	System.out.println("main:" + A.i);
	}
}
//no classes public
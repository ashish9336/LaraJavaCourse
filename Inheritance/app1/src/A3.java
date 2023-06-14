class R 
{
	R(int i)
	{
	System.out.println("R(int)");
	}
}
class T extends A
{
	T(int i)
{
System.out.println("T(int");
}

	public static void main(String[] args) 
	{
		T t1 = new T(90);
		System.out.println("done");
	}
}

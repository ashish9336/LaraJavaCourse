class R 
{
	R(int i)///no arugument constructer because error
	{
	System.out.println("R(int)");
	}
}
class T extends R
{
	
	T(int i)

{
	//super(i);
System.out.println("T(int");
}
	public static void main(String[] args) 
	{
		T t1 = new T(90);
		System.out.println("done");
	}
}
/*

required: int
  found:    no arguments
  reason: actual and formal argument lists differ in length

*/
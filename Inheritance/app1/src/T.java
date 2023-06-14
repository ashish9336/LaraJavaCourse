class A 
{
	A()
	{
		//super
		//IIB
	System.out.println("A()");
	}
	{
	System.out.println("IIB");
	}
}
class B extends A 
{
	B()
	{
		//Super
		//IIB
	System.out.println("B()");
	}
	{
	System.out.println("IIB1");
	}
	{
	System.out.println("IIB2");
	}
}
	class W
	{
	
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("----------");
		A a2 = new A();
		System.out.println("----------");
		B b1 = new B();
		System.out.println("----------");
		B b2 = new B();
		System.out.println("----------");

	}
}

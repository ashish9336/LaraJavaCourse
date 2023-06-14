class A 
{
	A()
	{
		//super
		//IIB
	System.out.println("A()");
	}
	A(int i)
	{
		//supper
		//IIB
	System.out.println("A(int)");
	}
	{
	System.out.println("A-IIB");
	}
	}
	class B extends A
	{
	B()
		{
		//super
		//IIB
		System.out.println("B()");
		}
		B(int i)
		{
			this();
			//IIB  //IIB is execute create object one time (not another time)
		System.out.println("B(int)");
		}
		{
		System.out.println("B-IIB1");
		}
		{
		System.out.println("B-IIB2");
		}
	}
	class X
	{
	
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("---------");
		A a2 = new A();
		System.out.println("---------");
		A b1 = new A();
		System.out.println("---------");
		A b2 = new A();
		System.out.println("---------");
		A a3 = new A();
		System.out.println("---------");
		A a4 = new A();
		System.out.println("---------");
		B b3 = new B();
		System.out.println("---------");
		A b4 = new A();
		System.out.println("---------");
		
	}
}
//IIB is always execue top to battom
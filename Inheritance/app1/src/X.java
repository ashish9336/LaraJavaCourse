class A 
{
	static 
	{
	System.out.println("A-SIB");
	}
}
class B extends A
{
	static 
	{
	System.out.println("B-SIB");
    }
}
class C extends B
{
	static 
	{
	System.out.println("C-SIB");
	}
}

class Z1 //this is main method
{
		static
	{
	System.out.println("Z1-SIB");
	}

	public static void main(String[] args) 
{
		System.out.println(" main begin");
		A a1 = new A();
		//B b1 = new B();
		System.out.println(" main end");
  }
 }

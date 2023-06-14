class A 
{
	int i;
	void test1()
	{
	System.out.println("A-test1");
	}
}

class D
{
	A obj; //null
	void test2()
  {
 System.out.println("D -test2");
 System.out.println(obj.d1);
 obj.test1();
 
  }
	public static void main(String[] args) 
	{
		D d1 = new D();
	    d1.test2();
	}
}
/*

D -test2

*/
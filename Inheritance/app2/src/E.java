class A 
{
	int i;
	void test1()
	{
	System.out.println("A-test1");
	}
}
	class D //non static
{
	A obj; //ibj = null; loading
	void test2()
{
    System.out.println("D -test2");
    System.out.println(obj.i);
    obj.test1();
 
}
}
 
class E
//non-static
{
A obj = new A();
//non-static
void test2() //i= NPE(null pointer exception)
{
System.out.println("E -test2");
 System.out.println(obj.i);
 obj.test1();

}

	public static void main(String[] args) 
	{
		E e1= new E();
		e1.test2();
	}
}
/*
null
0
A-test1

*/
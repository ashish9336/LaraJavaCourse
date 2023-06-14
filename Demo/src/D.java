package pack1;
class D 
{
  private void test()
	{
	System.out.println("from test()");
	}
}
class E
{

	public static void main(String[] args) 
	{
		D d1 = new D();
		d1.test();
		System.out.println("done");
	}
}
// private member not access outside method.
//private member only acces private mamber.
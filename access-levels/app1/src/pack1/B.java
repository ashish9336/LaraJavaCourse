package pack1;
class B 
{
  private int i;
}
class C
{

	public static void main(String[] args) 
	{
		B b1 = new B();  //error
		System.out.println(b1.i);
	}
}
// private member not access onether class
//private member can not access outside.
/*
 i has private access in B
*/
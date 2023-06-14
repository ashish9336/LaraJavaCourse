//singe inheritance
//parent/base/super-class
class A 
{
	int i;
}

//b class /child /dreried/sub-class    2- extentd is a kewword;
//extends is a keyword
//one class can able to extend another class at a time;

class B extends A 
{
int j;
	public static void main(String[] args) 
	{
		B b1 = new B();

		System.out.println(b1.i);
		System.out.println(b1.j);
	}


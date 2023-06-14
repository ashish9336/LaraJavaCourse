package pack1;
class J 
{  
	//private access
	//within the class itself THATS all.
  //x is private
  //private member not inheriting to the subclass
  private int x;
  int y;//y is default/package/friendly
  //default member can be inheites to the subclass within the same package
  //same class ok
  //sub-class- same package ===ok
  //non -sub-class ame -package == ok
  //outside the package === no
}
class K extends J
{

	public static void main(String[] args) 
	{
		J j1 = new J();

		System.out.println(j1.x);
		System.out.println(j1.y);
	}
}

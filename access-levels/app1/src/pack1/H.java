package pack1;
class H 
{
	private int i;
	public void set(int k)
	{

//this represent current object
//if the local and global are having the same nama, then local one will be given the preference. 
//thats why when you are refering to global varible include  'this'.


	this.i=k;
	//this.i = this.i;
	//k=this.i;
	}
	public int get()
	{
	  return i;
	}
}
class I
{	
	public static void main(String[] args) 
	{
		H h1 = new H();
		System.out.println(h1.get());//0
		h1.set(90);
		System.out.println(h1.get());//90

	}
}

class K 
{
	K()
	{
     super();
	 System.out.println("K()");
	}
}
class L extends K
{
L()
	{
	super();
	System.out.println("L()");
	}
	//System.out.println("L()");
	public static void main(String[] args) 
	{
		L obj = new L();
	}
}
// each and every class will be extending object class either directly or indirectly
//if class is not extending any other class then that class is direct subclass of object class
//if the class is alredy extending another class then class is the indirect sub-class of object class.
//whether we keep it or not compiler only keeps the extends for all the classes.
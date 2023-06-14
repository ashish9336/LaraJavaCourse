class H 
{
	static int i = test1();//i = 0;   
	static int j = test2(); //j = 0;
    static
	{
	System.out.println("from SIB " + i + "," + j); //i =0 , j =0
	i += 1; //1
	j += 2; //2
	
	}
	static int test1()
	{
	System.out.println("from test1 " + i + "," + j) //0 //0
		i += 3; //i+3 
	    j += 4; 
		return i + j + 10;  //3 + 4 + 10 =17
	}

	static int test2()
	{
	System.out.println("from test1 " + i + "," + j) //0 + 0
		i += 5;
	    j += 6; 
		return i + j + 20; //5 +6 + 20= 21
	}
		System.out.println


	public static void main(String[] args) 
	{
		System.out.println(i +","+ j);
	}                      //17 + 21
}

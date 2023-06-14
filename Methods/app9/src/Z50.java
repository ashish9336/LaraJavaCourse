class Z50 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
        int i = 1;
		int j =test1(++i) + i + test2(i++) + i + test3(i++)  + i  +
			//        2     2        2       3         3       4 =17
		      test4(++i) + i  +    
                 //    5     5                                   =10
              test1(i++) + i + test2(++i) + i + test3(++i) + i +
                 // 5      6         7     7           8     8   =
			  test4(i++) + i;
			//  7            9
        System.out.println("main end:" +i + " ," + j);
		                                     
	}
	public static int test1(int i)
	{
	return ++i; //3
	}
	public static int test2(int i)
	{
	return i++; //2   //7
	}
   public static int test3(int i)
	{
	return i--;//3  //8
	}
	public static int test4(int i)
	{
	return --i;//4 //8
	}
}

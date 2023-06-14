class M 
{              //i= 2;
	static int i = test1(); // i =0
	static int j = test2(); // j=0
	static    //j =3
	{
		System.out.println("sib begin:" + i + ", " + j);
		main(null);                    //0       //0
		System.out.println("sib end:" + i + ", " + j);
		i += 1;                      //0         //0
		j += 1;
	}
	static int test1()
	{
		System.out.println("test1 begin:" + i + ", " + j); // i =0 ,j =0
		main(null);                                       // main =0
		System.out.println("test1 end:" + i + ", " + j); //i =0 , j =0 
		i += j + 2;     // i= 0 +2, i= 2;
		j += i + 1;     // j = 2 + 1, j=3
		return i + j + test2(); // 2 + 3
	}
	static int test2()
	{                                       //i =2    j=3
		System.out.println("test2 begin:" + i + ", " + j);
		i += j + 5; //i = 3+ 5 , i = 8
		j += i + 4; //3 = 8 + 4 , j =12
		main(null); // main
		System.out.println("test2 end:" + i + ", " + j); //8        //12
		
		i += j + 4;   // i = 12 + 4 , i =16                 
		j += i + 5;   // j = 16 + 5 , j = 21
		return i + j + 10; // 16 + 21 + 10= 47
	}
	public static void main(String[] args) 
	{
		System.out.println("main :" + i + ", " + j);
		i += j + i;                  
		j += i + j;
	}
}

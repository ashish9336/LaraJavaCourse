class R 
{
    static int i = 10;
    static int j = 20;
    static int k;
    static int m = 30;
	public static void main(String[] args) 
	{
		System.out.println(i + " , " + j + " , " + k + " ," + m );
		i = 50; //globle
		j = 510;//globle
		k = 40;//globle
		m = 140;//globle
		System.out.println(i + " , " + j + " , " + k + " ," + m );
	}
}

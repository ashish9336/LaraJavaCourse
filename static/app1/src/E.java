class E 
{
   static char i;
   

	public static void main(String[] args) 
	{
		System.out.println(i); // this is not visible '\u0000'
		//System.out.println(j);
		// '\u0000' decimal equivalent is 00 char equivalent is null.
	}
}

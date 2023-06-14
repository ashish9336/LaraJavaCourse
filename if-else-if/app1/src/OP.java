class OP 
{
	public static void main(String[] args) 
	{
	/*
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println(true || true);
		*/
		int i = 0;
		System.out.println(true || (i++ ==0));//first condication true then true not chech the second condistion)
		System.out.println(i);
	}
}

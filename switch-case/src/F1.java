class F1
{
	public static void main(String[] args) 
	{
		int i = 10;
		switch(i)
		{
			case 2:
				System.out.println("from case 2");
				break;
				default:///thid is no break
			case 3:
				System.out.println("from case 3");
				
			break;
			case 5:	
				System.out.println("from case 5");
				
			break;
	}
	
	System.out.println("main end");
	}
}
//(no case of the mathcing)
//default:(control ecxecute)
import java.util.Scanner;
class F 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter one int short value ");
		Scanner sc = new Scanner(System.in);
		Short value = sc.nextShort();//nextByte() is retrive  byte value
		System.out.println("short value is : " + value);
	}
}

//byte< short < int < long < float < double
//short range -32768 to 32767
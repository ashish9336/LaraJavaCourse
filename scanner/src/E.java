import java.util.Scanner;
class E 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter one int byte value ");
		Scanner sc = new Scanner(System.in);
		byte value = sc.nextByte();//nextByte() is retrive  byte value
		System.out.println("Byte value is : " + value);
	}
}
//byte< short < int < long < float < double
//-128 to +127(byte range)
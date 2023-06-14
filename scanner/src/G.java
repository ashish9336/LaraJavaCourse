import java.util.Scanner;
class G 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter one long value ");
		Scanner sc = new Scanner(System.in);
		long value = sc.nextLong();//nextByte() is retrive  byte value
		System.out.println("long value is : " + value);
	}
}

//byte< short < int < long < float < double
// long range -9223372036854775808 to 9223372036854775807
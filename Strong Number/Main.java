import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		int Number, Temp, Factorial, i, Reminder, Sum = 0;			
		Scanner in=new Scanner(System.in);
		Number = in.nextInt();
		for (Temp = Number; Temp > 0; Temp = Temp / 10)
		{
			Factorial = 1;
			Reminder = Temp % 10;
		   for (i = 1; i <= Reminder; i++)
		   {
				Factorial = Factorial * i;
		   }			
			Sum = Sum + Factorial;
		}

		if (Number == Sum)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
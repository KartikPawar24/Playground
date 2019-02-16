import java.util.*;
public class Main 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int size = in.nextInt();
		int a[] = new int[size];
		int val;
		
		for(int i = 0; i < size; i++)
		{
			a[i] = in.nextInt(); 
		}
		
		val = a[0];
		
		for(int i = 0; i < size; i++)
		{
			if(a[i] > val)
			{
				val = a[i];
			}
		}
		
		for(int i = 0; i < size; i++)
		{
			if(a[i] == val)
			{
				System.out.println(i);
			}
		}
	}
}

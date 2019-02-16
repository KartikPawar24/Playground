import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner in = new Scanner(System.in);
		//System.out.println("Enter String1:");
		String str1 = in.nextLine();
		//System.out.println("Enter String2:");
		String str2 = in.nextLine();
		String temp = str1.concat(str1);
		//System.out.println(temp);
		if(temp.contains(str2))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
    }
}
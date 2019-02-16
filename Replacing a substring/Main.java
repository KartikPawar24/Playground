import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
     Scanner in = new Scanner(System.in);
	//	System.out.println("Enter the string:");
		String str = in.nextLine();
	//	System.out.println("Enter the substring to be replaced:");
		String rp_st = in.nextLine();
	//	System.out.println("Enter the new substring:");
		String new_st = in.nextLine();
        if(str.contains(rp_st))
		{
			str = str.replace(rp_st, new_st);
		}			
		System.out.println(str);
    }
}
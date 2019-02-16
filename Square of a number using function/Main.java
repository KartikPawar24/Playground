import java.util.Scanner;
class Main
{
  public static void Square(int n)
  {
    System.out.println(n * n);
  }
	public static void main (String[] args)
    {
	 // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      Square(n);
	} 
}
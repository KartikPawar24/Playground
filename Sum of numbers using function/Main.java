import java.util.Scanner;
class Main
{
  public static void Sum_Of_nums(int n)
  {
    int sum = 0;
    for(int i = 1; i <= n; i++)
    {
      sum = sum + i;
    }
    System.out.println(sum);
  }
  public static void main (String[] args)
  {
	    // Type your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    Sum_Of_nums(n);
  }
}
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    int exponent = in.nextInt();
    calculate(base, exponent);
  }
  public static void calculate(int m, int n)
  {
    System.out.println(Math.pow(m,n));
  }
}
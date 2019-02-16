import java.util.Scanner;
class Main{
  
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int num1 = in.nextInt();
      int num2 = in.nextInt();
      int num3 = in.nextInt();
      
      find(num1, num2, num3);
	}
 
  public static void find(int m, int n,int num)
  {
    int val;
    if(m > n)
    {
      val = m;
    }
    else
    {
      val = n;
    }
    if(num > val)
    {
      System.out.println(num);
    }
    else
    {
      System.out.println(val);
    }
  }  
}
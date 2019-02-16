import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a = 0;
      for(n = n; n > 0; n = n / 10)
      {
        int t = n % 10;
        a = a + t * t * t;
      }
      
      if(a == 153)
      {
        System.out.println("Armstrong Number");
      }
     else if(a == n)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
	}
}
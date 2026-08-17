import java.util.*;
public class armstrong
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter first  n prime number");
	    int n=sc.nextInt();
	   int sum=0;
	    int temp=n;
	   while(n>0){
	       int dig=n%10;
	       n=n/10;
	       sum=sum+dig*dig*dig;
	   }
	   if(temp==sum){
	       System.out.println("armstrong");
	   }
	   else
	   System.out.println("not a armstrong");
	}
}
	   

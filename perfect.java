import java.util.*;
public class perfect
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter first  n prime number");
	    int n=sc.nextInt();
	    int sum=0;
	    int temp=n;
	   for(int i=1;i<n;i++){
	       if(n%i==0){
	            sum+=i;
	       }
	   }
	   if(temp==sum)
	   {
	       System.out.println("perfect number");
	   }
	}
}

import java.util.*;
public class firstNprime
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter first  n prime number");
	    int n=sc.nextInt();
	    int count=0;
	    int j=2;
	while(count<n){
		boolean isprime=true;
		for(int i=2;i<=j/2;i++)
		{
		    if(j%i==0)
		    {
		        isprime=false;
		        break;
		    }
		}
		if(isprime)
		{
		    System.out.println(j);
		    count++;
		}
		j++;
		}
	}
}

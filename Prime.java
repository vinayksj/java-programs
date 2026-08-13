import java.util.*;
public class Prime
{
	public static void main(String[] args) {
	    
Scanner s=new Scanner(System.in);
boolean isprime=true;
int n=s.nextInt();
for(int i=2;i<=n/2;i++)
{
    if(n%i==0)
    {
        isprime=false;
    }
}
if(isprime)
System.out.println("prime");
else
System.out.println("not prime");

}
}

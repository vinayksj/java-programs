import java.util.*;
public class nprime
{
	public static void main(String[] args) {
	    
Scanner s=new Scanner(System.in);

int n=s.nextInt();
for(int j=2;j<=n;j++){
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
System.out.println(j);
}
}
}

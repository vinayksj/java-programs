import java.util.*;
public class nArmstrong
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter  number ");
	    int n=sc.nextInt();
	   int dig;
	    for(int i=1;i<=n;i++){
	         int temp=i;
	         int sum=0;
	        while(temp>0){
	        dig=temp%10;
	       temp=temp/10;
	       sum=sum+dig*dig*dig;
	            
	        }
	   if(i==sum){
	       System.out.println(i);
	   }
	    
	}
	}
}
	   
	   

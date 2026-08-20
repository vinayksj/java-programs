public class Strong
{
	public static void main(String[] args) {
		int n=145,sum=0;
		int temp=n;
		int fact=1,dig;
	while(n>0){
	    dig=n%10;
	    n=n/10;
	    for(int i=1;i<=dig;i++){
	        fact*=i;
	    }
	        sum=sum+fact;
	        fact=1;
	}
	if(temp==sum)
	    System.out.println("strong number");
	    else
	    System.out.println("not a strong number");
}
}

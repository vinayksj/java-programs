
public class Main
{
	public static void main(String[] args) {
	    
	    
	    int n=111;
	    int temp=n;
	    int pal=0;
	    
	    while(n>0)
	    {
	        int dig=n%10;
	        n=n/10;
	        pal=pal*10+dig;
	    }
	    if(temp==pal)
		System.out.print("paladrome");
		else
		System.out.print("not paladrome");
	}
}

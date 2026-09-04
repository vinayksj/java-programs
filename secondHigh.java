public class secondHigh
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int n=57219;
		int max=0;
		int s_max=0;
		while(n>0){
		    int dig=n%10;
		    n=n/10;
		    if(dig>max){
		        s_max=max;
		        max=dig;
		    }
		    else if(dig>s_max && dig!=max){
		        s_max=dig;
		    }
		}
		    System.out.println(s_max);
		
	}
}

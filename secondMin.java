public class secondMin
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int n=57219;
		int min=10;
		int s_min=10;
		while(n>0){
		    int dig=n%10;
		    n=n/10;
		    if(dig<min){
		        s_min=min;
		        min=dig;
		    }
		    else if(dig<s_min && dig!=min){
		        s_min=dig;
		    }
		}
		    System.out.println(s_min);
		
	}
}

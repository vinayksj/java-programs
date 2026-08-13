
public class sumLastFirst
{
	public static void main(String[] args) {
	    
	 int arr[]=new int[3];
	int n=125;
	
	for(int i=0;i<arr.length;i++)
	{
	    int dig=n%10;
	    n=n/10;
	    arr[i]=dig;
	  
	    
	}
	int first=arr[0];
	int sum=0;
	int last=arr[arr.length-1];
	sum=last+first;
	System.out.println(sum);
	    
	
	
}
}

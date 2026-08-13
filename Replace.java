
public class Replace
{
	public static void main(String[] args) {
	    
	 int arr[]=new int[10];
	int n=1010101010;
	for(int i=0;i<arr.length;i++)
	{
	    int dig=n%10;
	    n=n/10;
	    arr[i]=dig;
	    if(arr[i]==0)
	    arr[i]=5;
	}
	for(int j=arr.length-1;j>=0;j--){
	    System.out.print(arr[j]);
	    
	}
	
}
}

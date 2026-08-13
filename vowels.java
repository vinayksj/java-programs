import java.util.*;
public class vowels
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		int arr[]={'a','e','i','o','u'};
		boolean isvowel=false;
		for (int i=0;i<arr.length;i++)
		{
		    if(ch==arr[i])
		    {
		        isvowel=true;
		        break;
		       
		    }
		}
		if(isvowel)
		{
		    System.out.println("is vowel");
		}
		else{
		    System.out.println("is consonant");
		}
	}
	
}

import java.util.Scanner;
public class Type

{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		if((ch>='A' && ch<='Z') ||(ch>='a' && ch<='z'))
		{
		    System.out.println(" it is a character");
		}
		else if(ch>='0' && ch<='9')
		System.out.println("it is number");
		else
		System.out.println("it is a special char");
		
	}
}

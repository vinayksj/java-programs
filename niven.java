//niven or Harshad number
public class niven{
    public static void main(String[] args) {

        int n = 14;
        int sum=0,temp=n;
        while(n>0){
            int dig=n%10;
            n=n/10;
            sum+=dig;
        }
        System.out.println(sum);
        if(temp%sum==0)
            System.out.println("its harshad number");
            
        else
        System.out.println("not a harshad number");
        
        
    }
}

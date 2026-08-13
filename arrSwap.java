class arrSwap{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        System.out.println("array swap "+swap(arr,1,3));
        for(int ele:arr)
        System.out.println(ele);
       
    }    
    public static int[] swap(int a[],int pos1,int pos2){
        int temp=a[pos1];
        a[pos1]=a[pos2];
        a[pos2]=temp;
        return a;
    }
    
}

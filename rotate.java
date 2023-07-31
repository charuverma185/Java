import java.util.*;

public class rotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            
        }
        int n= arr.length;
        int r=arr[0];
        arr[0]=arr[n-1];
        arr[n-1]=r;
        for(int i=0;i<=n-1;i++){
            System.out.println(arr[i]);
        }
    }








    
}

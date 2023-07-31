import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int n=arr.length;
        int num[]= new int[size];
        int j=0;
        for(int i=n-1;i>=0; i--){
        num[j]=arr[i];
         j++;
        }
         for( j=0;j<n;j++){
            System.out.println(num[j]);
         }
             
        }
    }
    


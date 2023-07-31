import java.util.*;

public class sortthearray {
    
    public static void main(String[] args) {
        int arr[]={4,2,1,9,7,6};
        int n=arr.length;
        int key=0;
        for(int j=0;j<arr.length;j++){
            for(int i=j+1;i<arr.length;i++){

            
            if(arr[j]>arr[i]){
                key=arr[j];
                 arr[j]=arr[i];
                 arr[i]=key;

            }


            }
        }
        for(int i=0;i<n;i++){
        System.out.print(arr[i]);
        }
        
    }
    
}

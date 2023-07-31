import java.util.*;
public class sortedarray {
    public static void main(String[] args) {
        int arr[]={1,2,4,3,5,2};
        
        int t=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                t=1;
                break;

            }

        }
        if(t==1){
            System.out.println("Array is not sorted");
        }
        else{
            System.out .println("Array is sorted:");
        }
    }
    
}

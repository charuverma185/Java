 
import java.util.*;
public class barchart {
    public static void main(String[] args) {
        
    
    int arr[]={4,5,6,7,8};
    int n=arr.length;
   int  t=arr[n-1];
    for(int i=t;i>=1;i--){
        for(int j=0;j<n;j++){
            if(i<=arr[j]){
                System.out.print("*\t");
            }
            else{
                System.out.print("\t");
            }
        }
        System.out.println();
    }
     
        
        
        
       
         
    }
    
        
}
    


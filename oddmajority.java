import java.util.*;
public class oddmajority {
    public static void main(String[] args) {
        int a[]={1,1,2,2,3,3,3,4,4,5};
        int n=a.length;
         
        
        
        for(int i=0;i<n;i++){
             int count=0;
            for(int j=0;j<n;j++){
            if(a[i]==a[j]){
                count++;
            
                

            }
             
        }
        if(count%2!=0){
            System.out.println(a[i]);
        }
        }




    }
    
}

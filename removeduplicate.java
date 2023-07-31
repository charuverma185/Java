import java.util.*;
public class removeduplicate {
    public static void main(String[] args) {
        int a[]={1,1,2,3,4,4,5,7,7};
        int n=a.length;
        int j=0;
        for(int i=1;i<n;i++){
            if(a[i]!=a[j]){
                j++;
                a[j]=a[i];
            }
            
        }
        for(int i=0;i<=j;i++){
            System.out.println(a[i]);
        }
          
    }
    
}

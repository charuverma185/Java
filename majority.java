import java.util.*;
public class majority{
    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4,6,6,6,6,5,9};
        int n=arr.length;
        int num[]=new int[n];
        int count=arr[0];
        int r=0;
        int m=0;
        
        for(int i=0;i<n;i++){
             r=  m;
            m=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    m++;
                    if(m>r){
                        count=arr[i];
                    }
                }
                num[i]=m;
            }

        }
        Arrays.sort(num);
        System.out.println("majority element is:"+count);

    }
    
}

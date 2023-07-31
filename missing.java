import java.util.*;
public class missing {
    public static void main(String[] args) {
        int arr[]={ 1,3,5,6,7,7};
        int n=arr.length;
        int t=arr[n-1];
        int s=0;
        
        
        for(int i=arr[0];i<=t;i++){    
        
               
                if( arr[s]==i){
                    s++;
                     

                }
                else{
                    System.out.println(i);
                }
                
 

            }
            
        }
    }
    
    


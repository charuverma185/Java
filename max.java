import javax.print.attribute.standard.MediaSizeName;

import java.util.*;
public class max {
    public static void main(String[] args) {
        int arr[]={3,6,1,9,3,8,8};
        int n=arr.length;
        Arrays.sort(arr);
        System.out.println("maximum element is " +arr[n-1]);
    }
    
}

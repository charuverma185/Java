import java .util.*;
public class additionarray {
    public static void main(String[] args) {
        int a[]={9,2,3,4,5};
        int b[]={4,5,2,7,9};
        int c[]=new int[a.length > b.length ? a.length:b.length];
        int i=a.length-1;
        int j=b.length-1;
        int k=c.length-1;
        int carry=0;
        int sum=0;
        while(k>=0){
            if(i>=0&&j>=0){
            sum=a[i]+b[j]+carry;
        }
        else if(i>=0&&j<0){
            sum=a[i]+carry;

        }
        else if(i<0&&j>=0){
            sum=b[j]+carry;
        }
        carry=sum/10;
        sum=sum%10;
        c[k]=sum;
        i--;
        j--;
        k--;

    }
    if(carry!=0){
        System.out.print(carry);

    }
    for(int e:c){
        System.out.print(e);
    }
}
}

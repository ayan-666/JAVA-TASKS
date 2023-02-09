// Print prime numbers form 2 to 100

import java.util.Scanner;
public class PrimeRange {
    public static void main(String args[])
    {
        int m=2,n=100;
        int count =0;
        for(int i=m;i<=n;i++) {
            for(int j=2;j<i;j++) {
                if(i%j==0) {
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(i);
            }
            count=0;
        }
    }
}

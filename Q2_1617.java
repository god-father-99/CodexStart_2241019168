/*Name-Aditya Sahu
*Regd no.-2241019168
*PS link-https://cses.fi/problemset/task/1617
*/ 
import java.util.*;
public class Q2_1617 {
     static final long mod=1000000007;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long ans=1;
        for(int i=0;i<n;i++){
            ans=(ans*2)%mod;
        }
        System.out.println(ans);
    }
}

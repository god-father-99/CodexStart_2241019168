/*Name-Aditya Sahu
*Regd no.-2241019168
*PS link-https://cses.fi/problemset/task/1083
*/
import java.util.*;
public class Q6_1086 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n,temp,sum;
        n= sc.nextLong();
        sum=(n*(n+1))/2;
        for(int i=0;i<n-1;i++){
            temp= sc.nextLong();
            sum-=temp;
        }
        System.out.println(sum);
    }
}

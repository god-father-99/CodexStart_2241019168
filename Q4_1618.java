/*Name-Aditya Sahu
*Regd no.-2241019168
*PS link-https://cses.fi/problemset/task/1618
*/
import java.util.*;
public class Q4_1618 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int count=0;
        while(n>=5){
            count+=n/5;
            n/=5;
        }
        System.out.println(count);
    }
}

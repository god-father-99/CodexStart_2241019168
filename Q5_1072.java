/*Name-Aditya Sahu
*Regd no.-2241019168
*PS link-https://cses.fi/problemset/task/1072
*/
import java.util.*;
public class Q5_1072 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        for(long i=1;i<=n;i++) {
            long temp = ((i * i) * ((i * i) - 1)) / 2;
            temp = temp - (4 * (i - 1) * (i - 2));
            System.out.println(temp);
        }
    }
}

/*Name-Aditya Sahu
*Regd no.-2241019168
*PS link-https://cses.fi/problemset/task/1094
*/
import java.util.*;
public class increasingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long [] arr=new long[n];
        long count=0;
        long temp;
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextLong();
        }
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]) {
                count += arr[i - 1] - arr[i];
                arr[i] = arr[i - 1];
            }
        }
        System.out.println(count);
    }
}

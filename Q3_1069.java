/*Name-Aditya Sahu
*Regd no.-2241019168
*PS link-https://cses.fi/problemset/task/1069
*/ 
import java.util.*;
public class Q3_1069 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int maxi=1;
        int count=1;
        for(int i=1;i<s.length();i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
                maxi = Math.max(maxi, count);
            } else count = 1;
        }
        System.out.println(maxi);
    }
}

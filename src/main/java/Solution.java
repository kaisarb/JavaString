import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(A.length() + B.length());
        System.out.println((A.compareToIgnoreCase(B) > 0) ? "Yes" : "No" );
        System.out.println(A.substring(0,1).toUpperCase().concat(A.substring(1))
                .concat(" ").concat(B.substring(0,1).toUpperCase().concat(B.substring(1))));
    }

}

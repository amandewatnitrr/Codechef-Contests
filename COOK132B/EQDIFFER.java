import java.util.*;
import java.lang.*;
import java.io.*;
// Author: Sagar S
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
  public static void main (String[] args) throws java.lang.Exception
  {
    // your code goes here
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-- > 0) {
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
       
        int ans = 0;
        if(n > 2) {
            int max = Integer.MIN_VALUE;
            for(int k : map.keySet()) {
                if(map.get(k) > max) max = map.get(k);
            }
            if(max == 1) ans = n - 2;
            else ans = n - max;
        }
        System.out.println(ans);
    }
  }
}

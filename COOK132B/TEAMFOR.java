import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Codechef{
  
    public static class fastReader {
        BufferedReader br;
        StringTokenizer st;
        public fastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static int count(String word){
        int ans=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)=='1')
                ans++;
        }
        return ans;
    }
    public static void main(String[] args) throws java.lang.Exception{
        try {
//            fastReader sc = new fastReader();
            Scanner sc=new Scanner(System.in);
            int testCases = sc.nextInt();
            while (testCases-- > 0){
                int n = sc.nextInt();
                String bekar = sc.nextLine();
                String first=sc.next();
                String second=sc.next();
                int f = count(first);
                int s = count(second);
                int min = Integer.min(f,s);
                min = Integer.min(min,n/2);
                System.out.println(min);
            }
        }catch (Exception e){}
    }
}

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    
    
  public static void main (String[] args) throws java.lang.Exception
  {
      
      FastReader fr=new FastReader();
      
      int t=fr.nextInt();
      
      for(int j=0;j<t;j++){
          
          
          int n=fr.nextInt();
          
          int m=fr.nextInt();
          
          int q=fr.nextInt();
          
          boolean [] is_entered=new  boolean [n+1];
          
          int arr []=new int [q];
          int size=0;
          
          for(int i=0;i<q;i++){
              
              
              String data=fr.nextLine();
              data=data.replaceAll("\\s", "");
              
              arr[i]=Integer.parseInt(data);
              
              
            
              
              
          }
          
          boolean flag=false;
          
          for(int i=0;i<q;i++){
              
              if(arr[i]<0){
                  
                  if(is_entered[Math.abs(arr[i])]==false){
                      flag=true;
                      System.out.println("Inconsistent");
                      break;
                  }else{
                      is_entered[Math.abs(arr[i])]=false;
                      size--;
                  }
                  
              }else{
                  
                  is_entered[arr[i]]=true;
                  size++;
              }
              
              
              if(size>m){
                  flag=true;
                  System.out.println("Inconsistent");
                  break;
              }
              
          }
          
          if(flag==false){
              System.out.println("Consistent");
          }
          
          
          
          
          
      }
   
      
    
  }
}

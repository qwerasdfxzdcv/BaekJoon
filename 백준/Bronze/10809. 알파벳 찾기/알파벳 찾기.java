import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int[] a = new int[26];
        for(int k=0;k<a.length;k++){
            a[k] = -1;
        }
        for(int i=0;i<s.length();i++){
            char b = s.charAt(i);
            for(int j=0;j<26;j++){
                if(a[b-'a']==-1)
                a[b - 'a'] = i;
            }
        }
        for(int c=0;c<a.length;c++){
            System.out.print(a[c] + " ");
        }
    } 
}
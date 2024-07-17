import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] Array = new int[n];
        for(int b=0;b<n;b++){
            Array[b] = b+1;
        }
        for(int a=0;a<m;a++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st1.nextToken());
            int j = Integer.parseInt(st1.nextToken());
            int tmp = Array[i-1];
            Array[i-1] = Array[j-1];
            Array[j-1] = tmp;
        }
        for(int c=0;c<Array.length;c++){
            System.out.print(Array[c] + " ");
        }
    }
} 
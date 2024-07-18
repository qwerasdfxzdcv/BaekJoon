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
        int tmp=0;
        for(int a=0;a<m;a++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int i = (Integer.parseInt(st1.nextToken())-1);
            int j = (Integer.parseInt(st1.nextToken())-1);
            for(int d=i;d<j;d++){
                tmp = Array[i];
                Array[i++] = Array[j];
                Array[j--] = tmp;
            }
        }
        for(int c=0;c<Array.length;c++){
            System.out.print(Array[c] + " ");
        }
    }
} 
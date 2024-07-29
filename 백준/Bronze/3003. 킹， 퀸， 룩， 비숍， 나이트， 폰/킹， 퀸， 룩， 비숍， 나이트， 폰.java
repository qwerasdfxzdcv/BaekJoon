import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a[] = new int[6];
        for(int i=0;i<6;i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        System.out.print((1-a[0]) + " " + (1-a[1]) + " " + (2-a[2]) + " " + (2-a[3]) + " " + (2-a[4]) + " " + (8-a[5]));
    } 
}
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int i;
        int j;
        int k;
        for(i=0;i<n;i++){
            for(j=n-i-1;j>0;j--){
                System.out.print(" ");
            }
            for(k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
} 
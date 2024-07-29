import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());
        String star = "*";
        String space = " ";
        for(int i=1;i<n;i++){
            System.out.print(space.repeat(n-i)+star.repeat(2*i-1));
            System.out.print("\n");
        }
        for(int j=n;j>0;j--){
            System.out.print(space.repeat(n-j)+star.repeat(2*j-1));
            System.out.print("\n");
        }
    } 
}
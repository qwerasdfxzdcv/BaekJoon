import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        String a = br.readLine();
        String[] arr = a.split("");
        int len = arr.length;
        int count = 1;
        for(int i=0;i<(len);i++){
            if(a.charAt(i) != a.charAt((len-i-1))){
                count = 0;
            }
        }
        System.out.print(count);
    } 
}
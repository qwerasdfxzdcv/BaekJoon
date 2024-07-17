import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] Array = new int[31];
        for(int a=1;a<29;a++){
            //StringTokenizer st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(br.readLine());
            Array[i] = 1;
        }
        for(int b=1;b<Array.length;b++){
            if(Array[b]!=1){
                System.out.println(b);
            }
        }
    }
} 
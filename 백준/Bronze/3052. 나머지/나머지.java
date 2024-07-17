import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] Array = new int[10];
        for(int a=0;a<Array.length;a++){
            //StringTokenizer st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(br.readLine());
            Array[a] = i%42;
        }
        Array = Arrays.stream(Array).distinct().toArray();
        System.out.print(Array.length);
    }
} 
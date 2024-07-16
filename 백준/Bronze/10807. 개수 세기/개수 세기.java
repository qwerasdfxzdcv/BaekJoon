import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int[] intArray = new int[a];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int j=0;j<a;j++){
            intArray[j] = Integer.parseInt(st1.nextToken());
        }
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st2.nextToken());
        int count = 0;
        for(int i=0;i<a;i++){
            if(intArray[i]==b){
                count++;
            }
        }
        System.out.print(count);
    }
} 
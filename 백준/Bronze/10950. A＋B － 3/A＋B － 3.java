import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        for(int i=0;i<c;i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt((st1.nextToken()));
            int b = Integer.parseInt((st1.nextToken()));
            System.out.println(a+b);
        }
    }
} 
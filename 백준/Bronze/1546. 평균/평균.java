import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        double[] Array = new double[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            Array[i] = Double.parseDouble(st.nextToken());
        }
        Arrays.sort(Array);
        double max = Array[n-1];
        double sum = 0;
        for(int j=0;j<n;j++){
            sum += (Array[j]/max)*100;
        }
        System.out.print(sum/n);
    }
} 
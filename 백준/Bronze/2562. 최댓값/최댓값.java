import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int[] intArray = new int[9];
        for(int j=0;j<9;j++){
            intArray[j] = Integer.parseInt(br.readLine());
        }
        int[] intArray2 = new int[9];
        for(int k=0;k<9;k++){
            intArray2[k] = intArray[k];
        }
        Arrays.sort(intArray2);
        int max = intArray2[8];
        int bigindex = 0;
        for(int i=0;i<9;i++){
            if(intArray[i] == max){
                bigindex = i+1;
            }
        }
        System.out.println(max);
        System.out.print(bigindex);
    }
} 
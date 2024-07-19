import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        StringBuffer sb = new StringBuffer(a);
        String reversea = sb.reverse().toString();
        String b = st.nextToken();
        StringBuffer sb1 = new StringBuffer(b);
        String reverseb = sb1.reverse().toString();
        int aint = Integer.parseInt(reversea);
        int bint = Integer.parseInt(reverseb);
        if(aint>bint){
            System.out.print(aint);
        }else{
            System.out.print(bint);
        }
    } 
}
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        BigInteger b = new BigInteger("10");
        BigInteger c = new BigInteger("0");
            String s = br.readLine();
            BigInteger a = new BigInteger(s);
            for(int j=0;j<n;j++){
                c = c.add(a.mod(b));
                a = a.divide(b);
            }
        System.out.print(c);
    } 
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());    
        int c = Integer.parseInt(br.readLine());
        if(b+c>=60&&(a+((b+c)/60))>=24){
            a = (a+((b+c)/60))-24;
            b = (b+c)%60;
            System.out.println(a+" " +b);
        }else if(b+c>=60&&(b+c)%60==0){
            a = a+((b+c)/60);
            b = (b+c)%60;
            System.out.println(a+" " +b);
        }else if(b+c>=60){
            a = a+((b+c)/60);
            b = (b+c)%60;            
            System.out.println(a+" " +b);
        }else if(c>=60){
            b = b+(c%60);
            a = a+(c/60);
            System.out.println(a+" " +b);
        }
        else{
            System.out.println(a+" " +(b+c));
        }
    }
} 
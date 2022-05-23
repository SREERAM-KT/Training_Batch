import java.util.Scanner;
public class FibonnaciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] fibo=new int[n];
        fibo[0]=0;
        fibo[1]=1;
        for(int i=2;i<n;i++){
            fibo[i]=fibo[i-1]+fibo[i-2];
        }
        //System.out.println(fibo[n-1]);
        for(int i=0;i<n;i++){
            System.out.println(fibo[i]);
        }
    }
}

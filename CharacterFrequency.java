import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int[] freq=new int[128]; // 0
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)]++;
        }
        for(int i=0;i<128;i++){
            if(freq[i]>0){
                System.out.print((char)i+":"+freq[i]);
                System.out.println();
            }
        }
    }
}

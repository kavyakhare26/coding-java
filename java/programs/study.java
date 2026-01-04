import java.util.Scanner;

public class study {
    public static void main(String[] arg){
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int ans = 1;
        for(int i =1; i<=b ;i++){
            ans =ans*a;
        }
        System.out.println(ans);
    }            
}
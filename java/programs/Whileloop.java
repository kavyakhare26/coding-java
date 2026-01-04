import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
       // System.out.println("enter the value of n");
        int num =1;
        int sum =0;
        while(num<=n){
            //System.out.println(num);
            sum=sum+num;
            num++;
        }
        System.out.println(sum);
    }
}

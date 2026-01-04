import java.util.Scanner;

public class countandsum {

    public static void main(String[] arg){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int original_n =n;
        System.out.println("count no of digits:" +n);
        int noofdigit =0;
        while (n>0) {
             n=n/10;
            noofdigit++;
        }
        System.out.println("no of digits" +noofdigit);
    }
}    
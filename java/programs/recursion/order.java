import java.util.Scanner;

public class order {
       static void printdecreasing(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
        System.out.println(n);
        printdecreasing(n-1);
       }
       public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printdecreasing(n);
       }

    
}

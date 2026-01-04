import java.util.Scanner;

public class noofdigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int numofDigits = 0;
        int original_n = n;
        while(n>0){
            n=n/10;
            numofDigits ++;
        }
         System.out.println("no of Digits" + original_n + "=" +numofDigits);




    }
}

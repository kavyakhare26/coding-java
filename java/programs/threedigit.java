import java.util.Scanner;
public class threedigit {
    public static void main(String[] args){
        Scanner sc =new Scanner( System.in);
        System.out.println("enter a number:");
        int n =sc.nextInt();
        if(n%3==0 ||n%5==0){
          if(n%15!=0){
            System.out.println(" this is divisible by 3 or 5 but not 15");
          }
          else{
            System.out.println("not matching required condition ");
          }
        }      


    }
}
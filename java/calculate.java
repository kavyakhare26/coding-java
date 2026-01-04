import java.util.Scanner;

public class calculate {

   public static int Calculateaverage(int a, int b, int c) {
      int AVG = a+ b + c / 3;
      return AVG;
   }

   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int avg= Calculateaverage(a,b,c);
      System.out.println(avg);
   }
}
    


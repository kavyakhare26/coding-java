import java.util.Scanner;
public class areacircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius:");
        int radius;
        radius =sc.nextInt();
        double pi=3.145;
        double area= pi*radius*radius;
        System.out.println("the area of circle is:" +area);

    }
    
}

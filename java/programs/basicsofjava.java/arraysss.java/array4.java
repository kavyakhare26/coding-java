import java.util.Scanner;

public class array4{
    public static void main(String arg[]){
        Scanner  sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];
        for(int i=0; i<size ; i++){
            number[i] = sc.nextInt();
        }
        System.out.println("enter number to be find");
        int x= sc.nextInt();
        for(int i=0; i<number.length; i++){
            if(number[i]==x){
                System.out.println("x found at index:" +i);
            }
        }

    }
}
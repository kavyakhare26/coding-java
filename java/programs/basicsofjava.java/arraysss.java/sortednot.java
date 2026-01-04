import java.util.Scanner;

public class sortednot {
    public  static boolean isSorted(int [] arr){
        boolean check =true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                check=false;
                break;
            }
        }
        return check;

    }
    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            
        }
        System.out.println("issorted:"+ isSorted(arr));
            
    }
    
}

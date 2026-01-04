
import java.util.Arrays;
import java.util.Scanner;

public class array5 {
    static int[]  smallestandlargestelement (int[] arr){
        Arrays.sort(arr);
        
            int [] ans ={arr[0] ,arr[arr.length-1]};
            return ans;
        }
        static boolean isSorted(int[] arr){
            boolean check = true;
            for(int i=1;i<arr.length;i++){
                if(arr[i]<arr[i-1]){
                    check = false;
                    break;
                }
            }
            return check;

        }
        public static void main(String arg[]){
            Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
            int[] arr =new int[n];
            System.out.println("enter element");
            for(int i=0; i<arr.length;i++){
                arr[i]=sc.nextInt();
        }
        System.out.println("issorted" +isSorted(arr));

        
        System.out.println("isSorted:" +isSorted(arr));
        int[] ans = smallestandlargestelement(arr);
        System.out.println("largest" + ans[1]);
        System.out.println("smallest" + ans[0]);


    }



}

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class array3 {
        static int[] smallestAndlargestElement(int[] arr){
            Arrays.sort(arr);
            for(int i=0; i<arr.length; i++ ){
                System.out.println(arr[i]);
            }
        
            int[] ans = { arr[0],arr[ arr.length-1]};
            return ans;
             }

    
        
            static boolean isSorted(int[] arr){
                boolean check = true;
                for ( int i=1; i<arr.length; i++){

                if(arr[i] < arr[i-1]){
                    check = false;
                    break;



                }
            }
            return check;
        }



             
        
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size");
        int n = sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter elements");
        for( int i =0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }


        
        //System.out.println("enter x");
       // int x= sc.nextInt();
   
        System.out.println(" is Sorted:"+ isSorted(arr));  
        int[] ans = smallestAndlargestElement(arr);
        System.out.println("largest" + ans[1]);          
        System.out.println("smallest" + ans[0]);    
        


    }
}





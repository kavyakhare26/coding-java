import java.util.Scanner;

public class sortzero {
    static void printArray(int [] arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
         System.out.println();
    }
    static void sortzero(int[] arr){
        int n=arr.length;
        int zero=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
             zero++;
            }

        }
        
        for(int i=0;i<n;i++){
            if(i<zero){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }

        }

    }   
    
    public static void main(String arg[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter array size:");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("original array");
        printArray(arr);
        sortzero(arr);
        System.out.println("sorted array:");
        printArray(arr);
            

    }
}

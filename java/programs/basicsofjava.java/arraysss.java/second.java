import java.util.Scanner;

public class second{
    static int findMax(int[] arr){
        int Max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Max){
                Max =arr[i];

            }
        }
        return Max;
    }
    static int secondMax(int [] arr){
        int Max=findMax(arr);
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==Max){
            arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondMax=findMax(arr);
        return secondMax;
    }

public static void main(String [] arg){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter  no of elements");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter n elements:");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("second largest element:"+secondMax(arr));
}
}

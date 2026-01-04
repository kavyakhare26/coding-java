public class twopointer {
    static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i] +" ");

        }
        System.out.println();
    }
    static void sortzero(int[] arr){
        int n= arr.length;
        int zeroes =0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeroes ++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<zeroes){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }

    }
}

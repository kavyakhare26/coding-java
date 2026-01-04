public class arrayques {
   
    static void printArray(int[] arr, int idx){
        if(idx == arr.length){
            return;
        }
        
        System.out.print(arr[idx]); 
       
        printArray(arr, idx+1); 
    }
    static int maxinarray(int[] arr,int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int smallans = maxinarray(arr,idx+1);
        return Math.max(smallans ,arr[idx]);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,8,4,5};
       printArray(arr, 0);
       System.out.println();
       System.out.println(maxinarray(arr,0));
    }
}

    




public class swapproblem {
    static void printArray(int [] arr){
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i] +" ");
    }
    System.out.println();

    }    
        
    //static void swap(int a ,int b){
    //System.out.println("original before swap");
    //System.out.println("a"  +a);
    //System.out.println("b"  +b);
    //int temp =a;
    //a=b;
    //b=temp;
    //System.out.println("after swap");
    //System.out.println("a" +a);
    //System.out.println("b" +b);

    //}
    static int[] reversearray(int[] arr){
        int n= arr.length;
        int [] ans =new int [n];
        int j=0;
        for(int i=n-1;i>=0;i--){
            ans[j++]=arr[i];
        }
        return ans;

    }
    
public static void main(String [] arg){
      
      
       int [] arr ={1,2,3,4,5};
       int [] ans=reversearray(arr);
       printArray(ans);
    
}
}

    
     
     
    


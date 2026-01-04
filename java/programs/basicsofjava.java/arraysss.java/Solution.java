
import java.util.*;
class Solution {
    public  int[] twoSum( int[] nums ,int target) {
        int n =nums.length;
    
    
        for(int i =0;i<n;i++){
          for(int j =i+1;j<n;j++){
            if(nums[i]+nums[j]==target){
            return new int[]{i,j};
            }
        
          }
        }
         return null;
        }



    public static void main(String arg[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number of element in arr");
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i]=sc.nextInt();
                arr[j]=sc.nextInt();

            }
        }
        int target=sc.nextInt();
        System.out.println(twoSum(arr,target));
        Scanner.close();
    }
}    

  



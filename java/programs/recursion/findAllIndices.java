import java.util.ArrayList;
public class findAllIndices {
    static ArrayList<Integer> allindices(int[] a,int n,int target,int idx){


        if(idx>=n){
          return new ArrayList<Integer>();
        }
        ArrayList<Integer> ans =new ArrayList<>();
        if(a[idx]==target){
           ans.add(idx);
        }
        ArrayList<Integer> smallans =allindices(a,n,target,idx+1);
        ans.addAll(smallans);
        return ans;
    }
    public static void main(String [] args){
      int [] a= {4,2,4,4,5,4};
      int target =4;
      int n = a.length;
      ArrayList<Integer> ans =allindices(a,n,target,0);
      for(Integer i:ans){
        System.out.println(i);
      }
    }
}

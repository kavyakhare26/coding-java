import java.util.Scanner;

public class searchtarget {
    static void search(int[] a, int n,int target,int idx){

        if(idx>=n){
            return ;
        }
        if(a[idx]==target){
            System.out.println(idx);
        }
        search(a,n,target,idx+1);
    
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] a={4,2,4,4,6};
        int target =sc.nextInt();
        search(a,a.length,target,0);
        //if(search(a,a.length,target,0)){
           // System.out.println("yes");
        //}
        //else{
            //System.out.println("no");
        //}
    }
    
}

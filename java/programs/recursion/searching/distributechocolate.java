public class distributechocolate {
    static boolean isdivisionpossible(int[] a, int m, int mxchocoallowed){
        int numberofstudent =1;
        int choc =0;
        for(int i=0;i <a.length; i++){
            if(a[i]> mxchocoallowed) return false;
            if(choc+ a[i] <=mxchocoallowed){
                choc +=a[i];
            }
            else{
                numberofstudent ++;
                choc =a[i];
            }
        }
        return numberofstudent <= m;
        
    }
    static int distributechocolates(int[] a, int m){
        if(a.length <m) return -1;
        int ans =0,st =1, end =(int)1e9;
        while(st<=end){
            int mid =st +(end -st)/2;
            if(isdivisionpossible(a, m, mid)){
                ans =mid;
                end =mid-1;
            }
            else{
                st =mid+1;
            }
        }
        return ans;
    }
    public static void main( String[] args){
        int [] a ={5,3,1,4,2};
        int m =3;
        System.out.println(distributechocolates(a,m));
    }
}

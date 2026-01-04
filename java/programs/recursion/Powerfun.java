

public class Powerfun{
    static int pow(int p,int q){
        if(q==0){
            return 1;
        }
        int smallpow = pow(p,q/2);
        if(q%2==0){
            return smallpow *smallpow;
        }
         return p*smallpow*smallpow;
    }
    public static void main(String [] args){
        System.out.println(pow(2,4));
    }
    
}
d
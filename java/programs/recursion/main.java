public class main {
    static void sortfruits(String [] fruits){
        int n = fruits.length;
        for(int i=0;i<n-1;i++){
            int min_idx =i;
            for(int j=i+1;j<n-1;j++){
                if(fruits[j].compareTo(fruits[min_idx])<0){
                    min_idx =j;
                }
            }
            String temp =fruits[i];
            fruits[i]=fruits[min_idx];
            fruits[min_idx]=temp;
        }
    }
public static void main(String[] args){
    String[] fruits={"kivi","apple","mango"};
    sortfruits(fruits);
    for(String val :fruits){
        System.out.println(val +" ");
    }
}
}
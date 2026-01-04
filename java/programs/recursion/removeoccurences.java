import java.util.Scanner;

public class removeoccurences {
    static String removeA(String s, int idx){
        if(idx==s.length()){
            return "";
        } 
        String smallans  = removeA(s,idx+1);
        char currchar = s.charAt(idx);
        if(currchar!='a'){
          return currchar + smallans;
        }
        else{
            return smallans;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeA(s,0));
    }

}
    


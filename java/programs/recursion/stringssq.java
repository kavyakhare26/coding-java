public class stringssq {
    static void printssq(String s, String currans){
        if(s.length()==0){
            System.out.println(currans);
            return ;
        }
        char curr = s.charAt(0);
        String remstring= s.substring(1);
        printssq(remstring,currans+curr);
        printssq(remstring,currans);
        
    }
    public static void main(String[] args){
        printssq("abc"," ");
    }
    
}

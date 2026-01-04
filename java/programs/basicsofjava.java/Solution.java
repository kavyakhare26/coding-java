import java.util.Scanner;

class Solution {
    public boolean Palindrome(int x) {
        if(x<0||x % 10 == 0 && x !=0){
            return false;
        }
        
        
        int reverse =0;
        
        while(x>reverse){
            int remainder =x % 10;
            reverse= reverse*10 + remainder;
            x =x/10;
            break;
            
        }
        
        return true;
        
       
    } 
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
    
        
    }
    
    
}

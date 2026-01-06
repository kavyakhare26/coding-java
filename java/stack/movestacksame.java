

import java.util.Scanner;
import java.util.Stack;

public class movestacksame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            Stack<Integer> st =new Stack<>();
            int n;
            System.out.println("enter the no of elements");
            n=sc.nextInt();
            System.out.println("enter elements");
            for(int i=1;i<n;i++){
                int x=sc.nextInt();
                st.push(x);

            }
            System.out.println(st);
            Stack<Integer> rt =new Stack<>();
            while(st.size()>0){
                rt.push(st.pop());

            }
            System.out.println(rt);
            Stack <Integer> gt=new Stack<>();
            while(rt.size()>0){
                gt.push(rt.pop());
            }
            System.out.println(gt);

        
    }
    
}

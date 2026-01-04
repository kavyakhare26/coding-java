import java.util.*;
public class main{
    static void rotateright(char[][] box,int M,int N){
        for(int i=0;i<M;i++){
            int stones=0;
            for(int j=0;j<N;j++){
                if(box[i][j]=="*")stones++;
            }
            for(int j=0;j<N;j++){
                if(j<N-stones){
                    box[i][j]="-";
                }
                else{
                    box[i][j]="*";
                }
            }
        }
        static void rotateleft(char[][] box,int M,int N){
            for(int i=0;i<M;i++){

            int stones=0;
            for(int j=0;j<N;j++){
                if(box[i][j]=="*")stones++;
            }
            for(int j=0;j<N;j++){
                if(j<stones){
                    box[i][j]="*";
                }
                else{
                    box[i][j]=".";
                }
            }
        }public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int M = sc.nextInt();
            int N= sc.nextInt();
            sc.nextInt();
            char[][] box = new char[M][N];
            for(int i=0;i<M;i++){
                String line = sc.nextLine().trim();
                for(int j=0;j<n;j++){
                    box[i][j]=line.charAt(j);

                }
            }
            int K = sc.nextInt();
            sc.nextLine();
            for(int i=0;i<k;i++){
                String instructions=sc.nextLine().trim();
            }
        }

        }
        sc.close();
        
    }
}
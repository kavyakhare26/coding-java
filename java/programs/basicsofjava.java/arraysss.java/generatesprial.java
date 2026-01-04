import java.util.Scanner;

public class generatesprial {
    static void printmatrix(int[][] matrix){
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[i].length;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }
    static int[][] sprialmatrix(int n){
        int [][] matrix = new int[n][n];
        int toprow = 0,bottomrow =n-1,leftcol = 0,rightcol =n-1 , curr =1;
        while(curr <= n*n){
            for(int j=leftcol; j<=rightcol && curr <= n*n ;j++){
                matrix[toprow][j] = curr++;
            }
            toprow++;


            for(int i= toprow;i<=bottomrow && curr <=n*n; i++){
                matrix[i][rightcol] = curr++;
            }
            rightcol--;


            for(int j=rightcol; j>=leftcol && curr<n*n;j++){
                matrix[bottomrow][j] = curr++;
            }
            bottomrow--;

             for(int i=bottomrow;i>=toprow && curr < n*n; i++){
                matrix[i][leftcol] = curr++;
            }
            leftcol++;
            

        }
        return matrix;
    
    }
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();
        int [][] matrix = sprialmatrix(n);
        printmatrix(matrix);
    }
    
}

import java.util.Scanner;

public class twodarray {
    static void printArray(int [][] arr){
        for(int i =0;i<arr.length;i++){
            
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j] +" ");

            }
            System.out.println( );
        }
    }
    static void add(int [][] a,int r1, int c1,int [][] b, int r2, int c2){
        if(r1!=r2 || c1 != c2){
            System.out.println("not possible");
            return;
        }
        int [][] sum = new int [r1][r2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                sum[i][j] =a[i][j] + b[j][j];
            }

        }
        System.out.println("sum of matrix");
        printArray(sum);
    }
    public static void main(String []arg){
      Scanner sc  = new Scanner (System.in);
      System.out.println("enter elements of matrix 1");
      System.out.println("enter row");
      int r1= sc.nextInt();
      System.out.println("enter column");
      int c1= sc.nextInt();
      int[][] a = new int[r1][c1];
      System.out.println("enter"+r1*c1+"elements");
      for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){
            System.out.println("enter element at ["+i+"]["+j+"]:");
            a[i][j]=sc.nextInt();
        }
      }
      System.out.println("enter elements of matrix 2");
      System.out.println("enter row");
      int r2= sc.nextInt();
      System.out.println("enter column");
      int c2= sc.nextInt();
      int[][] b = new int[r1][c1];
      System.out.println("enter"+r2*c2+"elements");
      for(int i=0;i<r2;i++){
        for(int j=0;j<c2;j++){
            System.out.println("enter element at ["+i+"]["+j+"]:");
            b[i][j]=sc.nextInt();
        }
      }
      System.out.println("matrix1");
      printArray(a);
      System.out.println("matrix 2");
      printArray(b);
      add(a,r1,c1,b,r2,c2);
    }  
        
    

}    

import java.util.*;
public class SiameseMethod {
    public void printmatrix(int[][] magicSquare){
        for(int i=0;i<magicSquare.length;i++){
            for(int j=0;j<magicSquare[0].length;j++){
                System.out.print(magicSquare[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void fillMagicSquare(int n){
        int[][] magicSquare=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                magicSquare[i][j]=0;
            }
        }
        int row=0,column=n/2;

        for(int number=1;number<=n*n;number++){
            magicSquare[row][column]=number;
            if(magicSquare[(row-1)%n<0?(row-1)+n:row-1][(column+1)%n]==0){
                row=(row-1)%n<0?(row-1)+n:row-1;
                column=(column+1)%n;
            }else{
                row=row+1;
            }
        }
        printmatrix(magicSquare);

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        SiameseMethod sm=new SiameseMethod();
        System.out.println("Enter the order of square matrix(only odd number permitted)");
        int n=input.nextInt();
        if(n%2==1) {
            sm.fillMagicSquare(n);
        }
    }
}

import java.util.Scanner;

public class matrix2X2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  [][] m1 = new int[2][2];
        for(int i=0; i<2;i++)
        {  for (int j = 0; j<2;j++)
        {
            System.out.println("Enter the elment of "+i+j);
            m1[i][j]=sc.nextInt();
            }
            }
                for(int i=0; i<2;i++)
        {  for (int j = 0; j<2;j++)
        {
            System.out.print(m1[i][j] );
           System.out.print(" ");
            }
            System.out.println(" ");
            }
    
    }
}
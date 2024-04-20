import java.util.scanner;

public class matrix_opertations {
    public static void main(String[] args) {
        scanner sc = new scanner(System.in);
		int [][] a = new int[3][3];
		int [][] b = new int[3][3];
		int [][] c= new int[3][3];
		int [][] d=new int[3][3];
		int [][] e=new int[3][3];
		int [][] mul = new int[3][3];
		    //input matrix 1
		        for (int i=0;i<3;i++)
		        { for(int j =0;j<3;j++)
		        {
		            System.out.println("Enter the element of matrix 1 at "+ i+ j+" index");
		            a[i][j]=sc.nextInt();
		            }}
		            //input matrix 2
		             for (int i=0;i<3;i++)
		        { for(int j =0;j<3;j++)
		        {
		            System.out.println("Enter the element of matrix 2 at "+i+j+"  index");
		            b[i][j]=sc.nextInt();
		            }}
		            //sum
		            
		                 for (int i=0;i<3;i++)
		    { for(int j =0;j<3;j++)
		    {
		            c[i][j]=a[i][j]+b[i][j];
		            }}
		            //substraction
		            
		       
		        for (int i=0;i<3;i++)
		    { for(int j =0;j<3;j++)
		    {
		            c[i][j]=a[i][j]-b[i][j];
            }}
 //multiplication
 for (int i=0;i<3;i++)
 { for(int j =0;j<3;j++)
 {
          mul[i][j]=0;
    for(int k=0;k<3;k++){
        e[i][j]=mul[i][j]+a[k][j]*b[i][k];
        }
         }}
         //display sum
         for (int i=0;i<3;i++)
 { for(int j =0;j<3;j++)
 {
     System.out.print(c[i][j]);
     System.out.print(" ");
     }
     System.out.println("");
     }
          //display substraction    
              for (int i=0;i<3;i++)
 { for(int j =0;j<3;j++)
 {
     System.out.print(d[i][j]);
     System.out.print(" ");
     }
     System.out.println("");
     }
     //display product
          for (int i=0;i<3;i++)
 { for(int j =0;j<3;j++)
 {
     System.out.print(e[i][j]);
     System.out.print(" ");
     }
     System.out.println("");
     }
    

    }
}

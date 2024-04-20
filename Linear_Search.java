import java.util.scanner;

public class Linear_Search {
	public static void main(String[] args) {
        scanner sc = new scanner(System.in);
		int [] sahas = new int[9];
		for (int i  =0;i<9;i++)
		{  System.out.println("Enter the "+(i+1)+"element");
		    sahas[i]=sc.nextInt();
	    }
		    System.out.println("Enter the element you want to find");
		    int key = sc.nextInt();
		    for (int i =0; i<9;i++)
		    {
		        if(sahas[i]==key)
		        {
		           System.out.println("Element " +key + " found at "+ i ); 
		        }
		        }
}
}
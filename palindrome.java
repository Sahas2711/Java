//palindrome
import java.util.Scanner;
public class Main {
	static boolean pali(int n){
	    int o=n;
	    int r=0;
	    int rem=0;
	    for (int i=0;n!=0;i++)
		    { rem=n%10;
	 	    r=r*10+rem;
		    n=n/10;
	    } 
	    if(o==r)
	    {
	        return true;}
	        return false;}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter a number for checking of palindrom");
		a=sc.nextInt();
	boolean	 b = pali(a);
		 System.out.println(b);
		
	}
}
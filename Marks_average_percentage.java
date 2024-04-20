import java.util.Scanner;

public class Marks_average_percentage {
    public static void main(String[] args) {
        int mark1,mark2,mark3,mark4,sum;
  char name;
  float per;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter marks of Physics");
  mark1=sc.nextInt();
  System.out.println("Enter marks of Chemistry");
  mark2=sc.nextInt();
  System.out.println("Enter marks of Mathematics");
  mark3=sc.nextInt();
  System.out.println("Enter marks of Biology");
  mark4=sc.nextInt();
  sum = mark1+mark2+mark3+mark4;
System.out.println("Your final marks is "+ sum);
int avg = sum/4;
System.out.println("Your average in PCMB is "+avg);
  per = (sum*100)/400;
  System.out.println("Your percentage is " + per );
  }
}

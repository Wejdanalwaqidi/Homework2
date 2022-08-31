import java.util.Scanner;

public class W5 {
    public static void main(String[] args) {
        double  x ,y ,z, sum , av;
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number : ");
        x=input.nextDouble();
        System.out.println("enter second number : ");
        y=input.nextDouble();
        System.out.println("enter third number : ");
        z=input.nextDouble();
        sum=x+y+z;
        System.out.println("the sum is " +sum);
        av=sum/3;
        System.out.println("the avarage is " +av);
        }

}

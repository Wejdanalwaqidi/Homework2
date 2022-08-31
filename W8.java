import java.util.Scanner;

public class W8 {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        System.out.println("enter number : ");
        x=input.nextInt();
        System.out.println("the square is " + (x*x));
        System.out.println("the cube is " + (x*x*x));
        System.out.println("the power is " + Math.pow(x,4));
    }
}

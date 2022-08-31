import java.util.Scanner;

public class W4 {
    public static void main(String[] args) {
        int x,y,z;
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number : ");
        x=input.nextInt();
        System.out.println("enter second number : ");
        y=input.nextInt();
        z=y;
        y=x;
        x=z;
        System.out.println(x);
        System.out.println(y);
    }
}

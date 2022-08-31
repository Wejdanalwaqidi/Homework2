import java.util.Scanner;

public class W2 {
    public static void main(String[] args) {
        double pi=3.14 , area , circumference , radius ;
        Scanner input = new Scanner(System.in);
        System.out.println("enter radius : ");
        radius =input.nextDouble();
        area=radius*radius*pi;
        System.out.println("the area is " +area);
        circumference=2*radius*pi;
        System.out.println("the circumference is " +circumference);
    }
}

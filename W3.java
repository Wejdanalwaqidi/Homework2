import java.util.Scanner;

public class W3 {
    public static void main(String[] args) {
        double length , width , area , perimeter ;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the length : ");
        length=input.nextDouble();
        System.out.println("enter the width : ");
        width=input.nextDouble();
        area=width*length;
        perimeter=2*(length+width);
        System.out.println("the area is " +area);
        System.out.println("the perimeter is " +perimeter);

    }
}

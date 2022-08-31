import java.util.Scanner;

public class W9 {
    public static void main(String[] args) {
        int num1 , num2 , sum , dif , pro  ;
        double av;
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number : ");
        num1=input.nextInt();
        System.out.println("enter second number : ");
        num2=input.nextInt();
        sum=num1+num2;
        dif=num1-num2;
        pro=num1*num2;
        av=sum/2;
        System.out.println("the sum is " +sum);
        System.out.println("the difference is " +dif);
        System.out.println("the prodect is " +pro);
        System.out.println("the average is " +av);
        if (dif>0)
            System.out.println("the distance is " +dif);
        if (dif<0)
            System.out.println("the distance is " +(-1*dif));
        System.out.println(Math.max(num1,num2));
        System.out.println(Math.min(num1,num2));
    }
}

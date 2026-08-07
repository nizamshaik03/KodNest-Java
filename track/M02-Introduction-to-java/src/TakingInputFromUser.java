import java.util.Scanner;

public class TakingInputFromUser {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter byte value : ");
        byte a = sc.nextByte();
        System.out.println("the value is : " + a);

        System.out.println("Enter short value : ");
        short b = sc.nextShort();
        System.out.println("the value is : " + b);

        System.out.println("Enter int value : ");
        int c = sc.nextInt();
        System.out.println("the value is : " + c);

        System.out.println("Enter long value : ");
        long d = sc.nextLong();
        System.out.println("the value is : " + d);

        System.out.println("Enter float value : ");
        float e = sc.nextFloat();
        System.out.println("the value is : " + e);

        System.out.println("Enter double value : ");
        double f = sc.nextDouble();
        System.out.println("the value is : " + f);

        System.out.println("Enter boolean value : ");
        boolean h = sc.nextBoolean();
        System.out.println("the value is : " + h);

        sc.close();
    }
}
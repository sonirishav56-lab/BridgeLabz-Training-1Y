import java.util.Scanner;

class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();

        double pi = 3.14159;
        double area = pi * radius * radius;

        System.out.println("Area of the circle = " + area);
    }
}

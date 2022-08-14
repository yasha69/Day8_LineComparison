package Day8LineComparison_UC2;


import java.util.Scanner;

public class TwoEqualLines {
    static double length1;
    static double length2;
    public static void LineComparision() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a1: ");
        int a1 = sc.nextInt();
        System.out.println("Enter the value of a2: ");
        int a2 = sc.nextInt();
        System.out.println("Enter the value of b1: ");
        int b1 = sc.nextInt();
        System.out.println("Enter the value of b2: ");
        int b2 = sc.nextInt();
        System.out.println("Enter the value of x1: ");
        int x1 = sc.nextInt();
        System.out.println("Enter the value of x2: ");
        int x2 = sc.nextInt();
        System.out.println("Enter the value of y1: ");
        int y1 = sc.nextInt();
        System.out.println("Enter the value of y2: ");
        int y2 = sc.nextInt();
        length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of the line is: " + length1);
        length2 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
        System.out.println("Length of the line2 is: " + length2);
    }

    private static void checkingEqualsLine() {
        int a = (int) length1;
        int b = (int) length2;
        if (a == b) {
            System.out.println("Lines are equal");
        } else {
            System.out.println("Lines are not equal");
        }
    }

    public static void main(String[] args) {
        LineComparision();
        checkingEqualsLine();
    }
}
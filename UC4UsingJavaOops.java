package Day8LineComparison_UC4;

import java.util.Scanner;

public class UC4UsingJavaOops {
    static double length1;
    static double length2;
    public static void LineComparision() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a1: ");
        int x1 = sc.nextInt();
        System.out.println("Enter the value of x2: ");
        int x2 = sc.nextInt();
        System.out.println("Enter the value of y1: ");
        int y1 = sc.nextInt();
        System.out.println("Enter the value of y2: ");
        int y2 = sc.nextInt();
        int a1 = sc.nextInt();
        System.out.println("Enter the value of a2: ");
        int a2 = sc.nextInt();
        System.out.println("Enter the value of b1: ");
        int b1 = sc.nextInt();
        System.out.println("Enter the value of b2: ");
        int b2 = sc.nextInt();
        System.out.println("Enter the value of x1: ");
        length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of the line1 is: " + length1);
        length2 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
        System.out.println("Length of the line2 is: " + length2);
    }

    private static void comparingLine() {
        double val1=length1;
        double val2=length2;
        String str1 = String.valueOf(val1);
        String str2 = String.valueOf(val2);
        int z=str1.compareTo(str2);
        if (z==0) {
            System.out.println("lines are equal");
        }else if(z==-2){
            System.out.println("line1 is less than line2");
        }
        else {
            System.out.println("line1 is greater than line2");
        }
    }

    public static void main(String[] args) {
        LineComparision();
        comparingLine();
    }
}

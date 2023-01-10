package javaExercise1_50;
//11. Write a Java program to print the area and perimeter of a circle. Go to the editor
//
//        Radius = 7.5
//        Expected Output
//        Perimeter is = 47.12388980384689
//        Area is = 176.71458676442586
//         Area of a circle = πr2
//         The perimeter of a circle = 2πr
//          Diameter = 2 × Radius
//           R = D/2
//
//Area = π × r2, where 'r' is the radius.
//        Area = (π/4) × d2, where 'd' is the diameter.
//        Area = C2/4π, where 'C' is the circumference.
public class _11 {

    private static final double radius = 7.5;
    public static void main(String[] args) {

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}

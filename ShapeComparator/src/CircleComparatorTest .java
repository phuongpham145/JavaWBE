import java.util.Arrays;
import java.util.Comparator;
import Shape.Circle;
import Comparator.CircleComparator;
class CircleComparatorTest  {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5);

        System.out.println("Pre - Sorted");
        for (Circle circle : circles){
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();

        Arrays.sort(circles, circleComparator);
        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

    }
}

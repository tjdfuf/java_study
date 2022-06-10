package day13.poly.overLoading;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        System.out.println(rectangle.calcArea(5));
        System.out.println(rectangle.calcArea(10, 20));
    }
}

package day13.poly.casting;

public class Main {
    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.m1();
        parent.m2();

        Parent child = new Child();
        child.m1();
        child.m2();
        ((Child)child).m3();
    }
}

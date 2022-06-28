package day18.anonymous;

import utility.Util;

public class Main {

    // 내부 클래스
    public static class SubOperator implements Calculator{
        @Override
        public int operate(int n1, int n2) {
            return n1 - n2;
        }
    }


    public static void main(String[] args) {

        Calculator addCal = new AddOperator();
        System.out.println(addCal.operate(10, 20));

        SubOperator minusCal = new SubOperator();
        System.out.println(minusCal.operate(50, 30));

        // 익명 클래스
        Calculator multiCal = new Calculator() {
            @Override
            public int operate(int n1, int n2) {
                return n1 * n2;
            }
        };

        System.out.println(multiCal.operate(5, 3));

        // 람다
        Calculator divCal = (n1, n2) -> n1 / n2;
        System.out.println(divCal.operate(100, 50));

        Util.line();

        PowerfulOperator po = (f, s, cal) -> cal.operate(f, s);

        System.out.println(po.powerOperator(300, 500, new AddOperator()));
        System.out.println(po.powerOperator(700, 200, new SubOperator()));
        System.out.println(po.powerOperator(10, 30, new Calculator() {
            @Override
            public int operate(int n1, int n2) {
                return n1 * n2;
            }
        }));
        System.out.println(po.powerOperator(1000, 200, ((n1, n2) -> n1/n2)));


    }
}

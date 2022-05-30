package day08;

//import day08.fruit.Apple;
//import day08.fruit.Banana;
//import day08.fruit.Grape;

// day08.fruit.* = fruit 안의 모든 파일 import
import day08.fruit.*;


public class Test {

    public static void main(String[] args) {

//        day08.fruit.Apple apple = new day08.fruit.Apple();

        Apple apple = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        // 다른 패키지에 있는 클래스는 풀네임을 명시해야 한다.
        new Banana();
        new Grape();

    }
}

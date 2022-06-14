package day14.abs.pet;

import utility.Util;

public class Main {

    public static void main(String[] args) {

//        new Pet();

        Pet dog = new Dog("초코", "푸들", 3);
        Pet cat = new Cat("냥냥이", "러시안블루", 2);

        dog.feed();
        dog.takeNap();

        Util.line();

        cat.feed();
        cat.takeNap();
    }
}

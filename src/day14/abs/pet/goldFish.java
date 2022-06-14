package day14.abs.pet;

public class goldFish extends Pet{

    public goldFish(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void feed() {
        System.out.println("금붕어는 ...을 먹습니다.");
    }

    @Override
    public void takeNap() {
        System.out.println("금붕어는 물속에서 잡니다.");
    }
}

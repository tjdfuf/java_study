package day10;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("그렌져");
//        myCar.speed = 30000;
//        myCar.mode = 'F';

        myCar.setSpeed(60);

        System.out.println("현재속도 = " + myCar.getSpeed());

        myCar.setMode('D');
        System.out.println("현재속도 = " + myCar.getMode());

    }
}

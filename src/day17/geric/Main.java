package day17.geric;

public class Main {

    public static void main(String[] args) {

        AppleBasket ab = new AppleBasket();
        ab.setApple(new Apple());
        Apple apple = ab.getApple();

        BananaBasket bb = new BananaBasket();
        bb.setBanana(new Banana());
        Banana banana = bb.getBanana();

        Basket<Apple> ba = new Basket<>();
        ba.setFruit(new Apple());
        Apple a1 = ba.getFruit();
        System.out.println(a1);

        Basket<Banana> bbb = new Basket<>();
        bbb.setFruit(new Banana());
        Banana b1 = bbb.getFruit();
        System.out.println(b1);

        Basket<Grape> gg = new Basket<>();
        gg.setFruit(new Grape());
        Grape g1 = gg.getFruit();
        System.out.println(g1);

//        Basket<Toy> tb = new Basket<>();


    }
}

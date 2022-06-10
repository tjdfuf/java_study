package day12.final_;

public class Main {
    public static void main(String[] args) {

        Korean park = new Korean("박철수", "990123-1234567");
        Korean kim = new Korean("김영희", "201011-2258520");

        park.name = "박찬호";
//        kim.id = "880201-2135686";

        System.out.println(park);
        System.out.println(kim);
    }
}

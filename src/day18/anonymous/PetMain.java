package day18.anonymous;

public class PetMain {

    public static void main(String[] args) {

        Pet dog = new Pet() {

            String name;

            @Override
            public void play() {
                System.out.println("강아지는 산책하고 놀아요");
            }

            @Override
            public void eat() {
                System.out.println("강아지는 개껌을 먹어요");
            }
        };

//        Pet cat = () -> System.out.println("고양이는");

    }
}

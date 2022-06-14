package day14.abs.pet;

// 애완동물의 공통 클래스 (실체가 없는 추상적 개념)
public abstract class Pet {

    private String name;  // 이름
    private String kind;  // 종
    private int age;      // 나이


    public Pet(String name, String kind, int age) {
        this.name = name;
        this.kind = kind;
        this.age = age;
    }

    // 먹이를 먹는 기능
    public abstract void feed();  // 추상 메서드

    // 낮잠을 자는 기능
    public abstract void takeNap();  // 추상 메서드

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

package day15.inter;

// 인터페이스: 객체의 규격(기능)을 표준화해서 명세하는 역할
public interface Pet {

    // 인터페이스는 객체화 될 수 없으며, 필드도 가질 수 없음
    // 또한 상수와 추상메서드만 선언 가능

    String PLAY_GROUND = "애완동물 카페"; // 애완동물이 노는 장소

    void play(); // 애완동물이 노는 기능

    // 추상메서드 추가 이후 강제 오버라이딩을 막아준다
    // 여기서는 내용을 채우지 않고 필요한 클래스에 오버라이딩해서 쓴다
    default void smile() {}

    // 이 인터페이스를 쓰는 클래스 모두에게 적용
    static void m1() {
        System.out.println("hello");
    }

}

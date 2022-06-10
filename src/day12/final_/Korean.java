package day12.final_;

public class Korean {

    String name; // 이름
    final String id; // 주민번호
    static final String nation; // 국적

    static {
        nation = "대한민국";
    }
    // 상수: 불변성과 유일성을 모두 만족
    // 상수 만드는 법: static, final 둘 다 쓴다.
    public Korean(String name, String id) {
        this.name = name;
        this.id = id;
//        this.nation = nation;
    }

    @Override
    public String toString() {
        return "이름: " + name + "  주민번호: " + id;
    }

    // 주민번호를 바꾸는 메서드
    public void ChangeId(String id) {
//        this.id = id;
    }


}

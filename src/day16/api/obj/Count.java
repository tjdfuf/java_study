package day16.api.obj;

public class Count {

    int n;

    // 생성자
    public Count(int n) {
        System.out.println(n + "번 객체 생성됨!");
        this.n = n;
    }

    // 소멸자 ( java 에는 자동으로 삭제를 해주는 기능이 있음 )
    @Override
    protected void finalize() throws Throwable {
        System.out.println(n + "번 객체 소멸!");
    }
}

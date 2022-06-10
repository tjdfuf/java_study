package day13.poly.overLoading;

public class Rectangle {

    // 정사격형의 넓이를 구하는 기능
    // calcArea(int)
    public int calcArea(int len) {
        return len * len;
    }
    // calcArea(int, int)
    // 직사각형의 넓이를 구하는 기능
    public int calcArea(int w, int h) {
        return w * h;
    }

    // calcArea(double)
    public int calcArea(double abcd) {
        return 0;
    }

    // calcArea(int, String)
    public int calcArea(int a, String b) {
        return 0;
    }

    // calcArea(String, String)
    public int calcArea(String a, int b) {
        return 0;
    }

    // calcArea(int, int, int)
    public int calcArea(int a, int b, int c) {
        return 0;
    }

    // calcArea(int)
    // 리턴타입, 접근제한자는 상관없음
//    private void calcArea(int b) {
//
//    }
}

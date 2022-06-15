package day16.api.obj;

import utility.Util;

import static utility.Util.line;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Pen p1 = new Pen(123, "빨강", 1000);
        Pen p2 = new Pen(new Company("모나미", "서울"), 456, "노랑", 900);
        Pen p3 = new Pen(123, "초록", 1100);

        // p2를 복사해서 p4에 대립
//        Pen p4 = new Pen(p2.serial, p2.color, p2.price);
        // 얕은 복사 ( 안의 메서드 값 변경시 같이 바뀐다 )
//        Pen p4 = (Pen) p2.clone();
        Pen p4 = p2.deepClone();

        p2.color = "노오오오오랑";
        p2.company.address = "부산";

        System.out.println("p2 = " + p2);
        System.out.println("p4 = " + p4);
        // 같은 일련번호를 가지면 같은 공장에서 생산된 제품이라고 가정
        // 원래 equals 비교와 == 이 다르지 않지만 overriding 해서 일련번호 비교하는걸로 바꾸기
        System.out.println(p1.equals(p3));


        line();

        Count c = null;
        for (int i = 0; i < 20; i++) {
            c = new Count(i + 1);
            c = null;
            System.gc();  // 가비지 컬렉터를 좀 더 빨리 가동
        }


    }
}

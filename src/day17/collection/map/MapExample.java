package day17.collection.map;

import utility.Util;

import java.util.*;

class Student {
    String name; // 이름
    int grade; //학년

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}

public class MapExample {

    public static void main(String[] args) {

        Map<String, Student> map = new HashMap<>();

        // put(k, v) : 데이터 추가
        map.put("짹짹이", new Student("김철수", 3));
        map.put("냥냥이", new Student("도우너", 5));
        map.put("멍멍이", new Student("고길동", 1));

        System.out.println(map.size());
        System.out.println(map);


        // 중복된 key 객체로 put 을 하면 value 가 수정됩니다.
        // 같은 key 냥냥이인 도우너가 둘리로 수정된다.
        Util.line();
        map.put("냥냥이", new Student("둘리", 6));
        System.out.println(map);


        // get(key) : 저장된 value 참조
        Util.line();
        Student student = map.get("멍멍이");
        System.out.println("student = " + student);

        student.name = "빠빠빠";
        System.out.println(map);

        // containsKey(key) : map 에 key 가 있는지 유무 확인
        Util.line();

        System.out.println(map.containsKey("꽉꽉이"));
        System.out.println(map.containsKey("짹짹이"));



        // map 루프 처리
        Util.line();
        Set<String> keySet = map.keySet();// map 의 모든 key 를 Set 에 담아줌.
        System.out.println(keySet);

        for (String key : keySet) {
            System.out.println(map.get(key));
        }

        // remove(key) : key 에 해당하는 Entry 삭제
        Util.line();
        map.remove("냥냥이");
        System.out.println(map);

        map.clear();
        System.out.println(map.isEmpty());

        // map 에 value 값으로 List 를 사용하려면
        Map<String, List<Integer>> mapList = new HashMap<>();

    }
}
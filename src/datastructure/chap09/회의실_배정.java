package datastructure.chap09;

import java.util.*;

public class 회의실_배정 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<List<Integer>> A = new ArrayList<>();

//        A.add(new ArrayList<Integer>(Arrays.asList(0, 6)));
//        A.add(new ArrayList<Integer>(Arrays.asList(3, 5)));
//        A.add(new ArrayList<Integer>(Arrays.asList(1, 4)));
//        A.add(new ArrayList<Integer>(Arrays.asList(5, 9)));
//        A.add(new ArrayList<Integer>(Arrays.asList(5, 7)));
//        A.add(new ArrayList<Integer>(Arrays.asList(3, 8)));
//        A.add(new ArrayList<Integer>(Arrays.asList(8, 11)));
//        A.add(new ArrayList<Integer>(Arrays.asList(6, 10)));
//        A.add(new ArrayList<Integer>(Arrays.asList(2, 13)));
//        A.add(new ArrayList<Integer>(Arrays.asList(8, 12)));
//        A.add(new ArrayList<Integer>(Arrays.asList(12, 14)));

        for (int i = 0; i < n; i++) {
            List<Integer> a = new ArrayList<>();
            a.add(sc.nextInt());
            a.add(sc.nextInt());
            A.add(a);
        }
//        for (List<Integer> integers : A) {
//            System.out.println(integers);
//        }

        // 뒷자리 낮은순으로 정렬
        A.sort((nList1, nList2) -> {
            if (nList1.get(1) == nList2.get(1)) {
                return nList1.get(0) - nList2.get(0);
            }
            return nList1.get(1) - nList2.get(1);
        });
        
//        for (List<Integer> nums : A) {
//            System.out.println(nums);
//        }
        int st = A.get(0).get(0);
        int end = A.get(0).get(1);
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (A.get(i).get(0) >= end) {
                st = A.get(i).get(0);
                end = A.get(i).get(1);
                count++;
            }
        }
        System.out.println(count);


    }
}

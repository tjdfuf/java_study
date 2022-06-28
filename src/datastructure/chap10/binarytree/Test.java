package datastructure.chap10.binarytree;

import java.util.TreeMap;
import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        /*
                              50
                27                              68
        12              36              55              82
    7      19      **       49      **      **      76      **

         */
        tree.add(50);
        tree.add(27);
        tree.add(68);
        tree.add(12);
        tree.add(36);
        tree.add(55);
        tree.add(82);
        tree.add(7);
        tree.add(19);
        tree.add(49);
        tree.add(76);

        System.out.println("=============== 순회 ===============");
        System.out.println("=============== 전위 순회 ===============");
        tree.preOrder(tree.getRoot());
        System.out.println();
        System.out.println("=============== 중위 순회 ===============");
        tree.inOrder(tree.getRoot());
        System.out.println();
        System.out.println("=============== 후위 순회 ===============");
        tree.postOrder(tree.getRoot());
        System.out.println();

        System.out.println("=============== 탐색 ===============");

        Node found = tree.find(27);
        System.out.println(found);

        found = tree.find(100);
        if (found == null) {
            System.out.println("탐색 실패");
        }


        System.out.println("=============== 최대, 최솟값 탐색 ===============");
        Node min =  tree.findMin();
        System.out.println(min);

        Node max = tree.findMax();
        System.out.println(max);

        System.out.println("=============== 트리 출력 ===============");

        tree.delete(36);
        tree.delete(82);
//        tree.delete(50);
        tree.display();

        // 트리의 문제점
        BinaryTree tree2 = new BinaryTree();

        tree2.add(50);
        tree2.add(40);
        tree2.add(30);
        tree2.add(20);

        System.out.println("=============== 이진트리의 문제점 ===============");
        tree2.display();
        // 리스트와 똑같은 형식이 되버릴 수 있음

        System.out.println("=============== API 트리사용 ===============");

        // TreeSet : Set 형태로 트리를 구현
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(77);
        treeSet.add(27);
        treeSet.add(7);
        treeSet.add(67);
        System.out.println(treeSet);

        // TreeMap : Map 형태로 트리를 구현
        TreeMap<String, Integer> treemap = new TreeMap<>();
        treemap.put("멍멍이", 30);
        treemap.put("야옹이", 55);
        treemap.put("짹짹이", 44);
        treemap.put("강쥐", 155);

        System.out.println(treemap);

    }

}

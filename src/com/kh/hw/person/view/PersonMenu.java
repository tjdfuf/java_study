package com.kh.hw.person.view;

import com.kh.hw.person.controller.PersonController;

import java.util.Scanner;

public class PersonMenu {
    Scanner sc;
    PersonController pc;

    public PersonMenu() {
        sc = new Scanner(System.in);
        pc = new PersonController();
    }

    // 메인메뉴
    public void mainMenu() {
        System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
        System.out.printf("현재 저장된 학생은 %d 명입니다.", pc.personCount()[0]);
        System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
        System.out.printf("현재 저장된 사원은 %d 명입니다.\n", pc.personCount()[1]);

        String[] Menu = {"1. 학생 메뉴", "2. 사원 메뉴", "9. 끝내기"};
        for (String menuStr : Menu) {
            System.out.println(menuStr);
        }
        int input = inputInt(" 메뉴 번호 : ");

        switch (input) {
            case 1:
                studentMenu();
                break;
            case 2:

                break;
            case 9:
                System.out.println("종료합니다.");
                break;
        }


    }

    // 메인메뉴 끝

    // 학생메뉴
    private void studentMenu() {
        String[] studentMenu = {"1. 학생 추가", "2. 학생 보기", "9. 메인으로"};
        for (String stuMenu : studentMenu) {
            System.out.println(stuMenu);
        }
        int input = inputInt(" 메뉴 번호 : ");

        switch (input) {
            case 1:
                if (pc.personCount()[0] == 3) {
                    System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
                    break;
                }
                insertStudent();
                break;
            case 2:

                break;
            case 9:
                System.out.println("메인으로 돌아갑니다.");
                return;
        }
    }

    private void insertStudent() {
        while (true) {
            String name = inputStr("학생 이름: ");
            int age = inputInt("학생 나이: ");
            int height = inputInt("학생 키: ");
            int weight = inputInt("학생 몸무게: ");
            int grade = inputInt("학생 학년: ");
            String major = inputStr("학생 전공: ");
            pc.insertStudent(name, age, height, weight, grade, major);
            int count = pc.personCount()[0];
            if (count < 3) {
                System.out.printf("그만하시려면 N(또는 n), 이어하시려면 아무키나 누르세요: ");
                String select = sc.nextLine();
                if (select.toUpperCase().equals("N")) return;
            } else {
                System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
                return;
            }
        }
    }



    // 입력받기
    public int inputInt(String arg) {
        System.out.print(arg);
        int z = -1;
        while (true) {
            try {
                z = sc.nextInt();
                return z;
            } catch (java.util.InputMismatchException e) {
                System.out.print("잘못 입력하셨습니다. 다시 입력해주세요. \n # 메뉴 입력 : ");
                sc.nextLine(); // 이거 무한루프
            }
        }
    }

    public String inputStr(String arg) {
        System.out.print(arg);
        return sc.next();
    }
    // 입력받기 끝
}

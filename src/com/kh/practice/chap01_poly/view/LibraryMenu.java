package com.kh.practice.chap01_poly.view;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;
import day11.protec.pec1.A;
import utility.Util;

import java.util.Arrays;
import java.util.Scanner;

public class LibraryMenu {

    private LibraryController lc;
    private Scanner sc;
    private Member mem;

    public LibraryMenu() {
        lc = new LibraryController();
        sc = new Scanner(System.in);
        mem = new Member();
    }

    public void  login() {
        System.out.println("================ 로그인 ================");
        String name = Util.inputS("이름: ");
        int age = Util.inputN("나이: ");
        char gender = Util.inputS("성별: ").charAt(0);
        lc.insertMember(name,age,gender);
        mainMenu();
    }

    public void mainMenu() {
        while (true) {
            System.out.println("==== 메뉴 ====");
            String[] menu = {" # 1. 마이페이지", " # 2. 도서 전체 조회", " # 3. 도서 검색", " # 4. 도서 대여하기", " # 9. 프로그램종료"};
            for (String menuStr : menu) {
                System.out.println(menuStr);
            }
            int input = Util.inputN("메뉴 입력: ");
            switch (input) {
                case 1:
                    mypage();
                    break;
                case 2:
                    searchAll();
                    break;
                case 3:
                    searchKeyWord();
                    break;
                case 4:
                    lendBook();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
                    break;
            }
        }

    }

    private void lendBook() {
        searchAll();
        int input = Util.inputN("대여 할 책의 번호를 입력하여주세요");
        int okNo = lc.rentBook(input);
        switch (okNo) {
            case 1:
                if (lc.selectAll()[input-1] instanceof AniBook) {
                    if (((AniBook) lc.selectAll()[input-1]).getAccessAge() > mem.getAge()) {
                        System.out.println("대여 완료");
                    } else {
                        System.out.println("대여 불가능한 나이입니다.");
                    }
                }
                break;
            case 2:
                if (lc.selectAll()[input-1] instanceof CookBook) {
                    if (((CookBook) lc.selectAll()[input-1]).isCoupon()) {
                        mem.setCouponCount(mem.getCouponCount()+1);
                        System.out.println("요리학원 쿠폰이 발급되었습니다.");
                    }
                System.out.printf("대여 완료");
            }
                break;
            case 0:
                System.out.println("대여 완료");
                break;
        }
    }

    private void searchKeyWord() {

        System.out.print("\n# 검색어: ");
        String keyword = sc.next();

        Book[] books = lc.searchBook(keyword);

        if (books.length == 0) {
            System.out.println("# 검색된 도서가 없습니다.");
        } else {
            System.out.printf("\n================= 검색 결과(검색어: %s) ==================\n", keyword);
            for (Book b : books) {
                System.out.println(b.toString());
            }
        }
    }


    /*
    private void searchKeyWord() {
        String searchCode = Util.inputS("검색할 제목 키워드: ");
        Book[] searchBook = lc.searchBook(searchCode);
        if (searchBook == null) {
            System.out.println("검색한 제목의 책이 없습니다.");
        }
        for (int i = 0; i < searchBook.length; i++) {
            if (searchBook[i] instanceof CookBook) {
                System.out.printf("%d번도서: %s / %s / %s / %b\n", i, searchBook[i].getTitle(), searchBook[i].getAuthor(), searchBook[i].getPublisher(), ((CookBook) searchBook[i]).isCoupon());
            } else if (searchBook[i] instanceof AniBook) {
                System.out.printf("%d번도서: %s / %s / %s / %d\n", i, searchBook[i].getTitle(), searchBook[i].getAuthor(), searchBook[i].getPublisher(), ((AniBook) searchBook[i]).getAccessAge());
            } else {
                System.out.printf("%d번도서: %s / %s / %s\n", i, searchBook[i].getTitle(), searchBook[i].getAuthor(), searchBook[i].getPublisher());
            }
        }
    }
     */

    private void searchAll() {
        Book[] all = lc.selectAll();


        for (int i = 0; i < lc.selectAll().length; i++) {
            if (all[i] == null) break;
            if (all[i] instanceof CookBook) {
                System.out.printf("%d번도서: %s / %s / %s / %b\n", i+1, lc.selectAll()[i].getTitle(), all[i].getAuthor(), all[i].getPublisher(), ((CookBook) all[i]).isCoupon());
            } else if (all[i] instanceof AniBook) {
                System.out.printf("%d번도서: %s / %s / %s / %d\n", i+1, all[i].getTitle(), all[i].getAuthor(), all[i].getPublisher(), ((AniBook) all[i]).getAccessAge());
            } else {
                System.out.printf("%d번도서: %s / %s / %s / %d\n", i+1, all[i].getTitle(), all[i].getAuthor(), all[i].getPublisher());
            }
        }

    }

    private void mypage() {
        String name = lc.myInfo().getName();
        int age = lc.myInfo().getAge();
        char gender = lc.myInfo().getGender();
        System.out.println("===== 나의 정보 =====");
        System.out.printf("  이름:  %s\n  나이:  %d\n  성별:  %s\n", name, age, gender);
    }


}

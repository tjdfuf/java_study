package com.kh.practice.chap01_poly.controller;


import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;
import day08.modi.pac2.C;

import java.util.LinkedList;
import java.util.Queue;

public class LibraryController {

    Member mem;
    Book[] bList;

    public LibraryController() {
        mem = new Member();
        bList = new Book[5];
        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스", "루피", "일본", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
    }

    public void insertMember(String name, int age, char gender) {
        Member m = new Member(name, age, gender);
        mem = m;
    }

    public Member myInfo() {
        return mem;
    }

    public Book[] selectAll() {
        return bList;
    }

    /*
    public Book[] searchBook(String keyWord) {
        Book[] searchBook = new Book[5];
        int count = 0;
        for (int i = 0; i < bList.length; i++) {
            if (bList[i].getTitle().contains(keyWord)) {
                searchBook[count] = bList[i];
                count++;
            }
        }
        if (searchBook[0] == null) return null;
        return searchBook;
    }
     */
    // 제목으로 도서 검색 기능
    public Book[] searchBook(String keyword) {

        // 검색된 책들을 담아둘 큐를 생성
        Queue<Book> bookQueue = new LinkedList<>();

        // 책 검색 시작
        for (Book book : bList) {
            if (book.getTitle().contains(keyword)) {
                bookQueue.add(book);
            }
        }

        Book[] searchedList = new Book[bookQueue.size()];
        for (int i = 0; i < searchedList.length; i++) {
            searchedList[i] = bookQueue.poll();
        }
        return searchedList;
    }


    public int rentBook (int index) {
        int result = 0;

        if (bList[index] instanceof AniBook) {
            if (((AniBook) bList[index]).getAccessAge() > mem.getAge()) {
                result = 1;
            }
        } else if(bList[index] instanceof CookBook) {
            if (((CookBook) bList[index]).isCoupon()) {
                mem.setCouponCount(mem.getCouponCount()+1);
                result = 2;
            }
        }
        return result;
    }
}

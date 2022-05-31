package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

import java.util.Objects;

public class MemberController {

    private Member[] m = new Member[SIZE];

    public static final int SIZE = 10;

    public MemberController() {
        m[0] = new Member("abc", "김철수", "1234", "abc@naver.com", 'M', 24);
        m[1] = new Member("def", "박영희", "4321", "def@naver.com", 'F', 32);
        m[2] = new Member("ghi", "김철수", "6544", "ghi@naver.com", 'M', 44);

    }


    /**
     * 실제로 배열에 저장되어 있는 회원객체의 숫자를 세는 메서드
     *
     * @return count - 실제 저장된 회원의 수
     */
    public int existMemberNum() {
        int count = 0;
        for (Member member : m) {
            if(member == null) {
                break;
            }
            count++;
        }
        return count;
    }


    /**
     * 아이디 중복을 체크하는 메서드
     *
     * @param inputId - 중복을 확인할 사용자의 입력 아이디
     * @return 중복되었으면 true, 아니면 false
     */
    public boolean checkId(String inputId) {
        return findIndexById(inputId) != -1;
    }



    //멤버 배열 리턴
    public Member[] printAll() {
        return m;
    }

    //회원정보를 배열 m에 저장하는 메서드
    public void insertMember(String id, String name, String password
            , String email, char gender, int age) {
        int idx = existMemberNum();
        m[idx] = new Member(id, name, password, email, gender, age);
    }

    /**
     * 아이디를 입력하면 해당 회원 객체를 리턴
     *
     * @param inputId - 검색할 회원의 아이디
     * @return Member - 찾은 경우 해당 아이디를 가진 회원의 전체정보를 가진 객체
     * - 못 찾은 경우 null 리턴
     */
    public Member searchId(String inputId) {
        int index = findIndexById(inputId);
        return (index != -1) ? m[index] : null;
    }


    /**
     * @param name - 검색할 회원의 이름
     * @return 동명이인 포함 해당 이름과 일치하는 모든 회원정보 배열
     */
    public Member[] searchName(String name) {

        // 임시 배열 생성
        Member[] temp = new Member[SIZE];
        int count = 0;
        for (int i = 0; i < existMemberNum(); i++) {
            if(name.equals(m[i].getName())) {
                temp[count++] = m[i];
            }
        }
        // 리턴할 배열
        Member[] returned = new Member[count];
        for (int i = 0; i < returned.length; i++) {
            returned[i] = temp[i];
        }
        return returned;
    }

    /**
     * 회원의 비밀번호를 변경하는 메소드
     *
     * @param id          - 변경을 요청한 회원의 아이디
     * @param newPassword - 새로운 비밀번호
     * @return - 변경 성공 여부
     */
    public boolean updatePassword(String id, String newPassword) {
        for (Member member : m) {
            if(member == null) break;
            if(id.equals(member.getId())) {
                member.setPassword(newPassword);
                return true;
            }
        }
        return false;
    }

    /**
     * @param id      - 수정할 회원의 아이디
     * @param newName - 새롭게 수정될 새로운 이름
     * @return 수정 성공시 true
     */
    public boolean updateName(String id, String newName) {
        for (Member member : m) {
            if(member == null) break;
            if(id.equals(member.getId())) {
                member.setName(newName);
                return true;
            }
        }
        return false;
    }

    /**
     * @param id       - 수정할 회원의 아이디
     * @param newEmail - 새롭게 수정될 새로운 이메일
     * @return 수정 성공시 true
     */
    public boolean updateEmail(String id, String newEmail) {
        for (Member member : m) {
            if(member == null) break;
            if(id.equals(member.getId())) {
                member.setEmail(newEmail);
                return true;
            }
        }
        return false;
    }

    /**
     * 아이디를 통해 회원배열에서 특정 회원이 저장된 인덱스를 알려주는 기능
     *
     * @param id - 찾을 회원의 아이디값
     * @return 찾은 회원의 인덱스값, 못찾을 시 -1 리턴
     */
    public int findIndexById(String id) {
        int index = -1;
        for (int i = 0; i < existMemberNum(); i++) {
            if (id.equals(m[i].getId())) {
                index = i;
                break;
            }
        }
        return index;
    }


    //회원정보 하나를 삭제하는 메서드

    /**
     * @param id - 삭제를 원하는 회원의 아이디정보
     * @return 삭제성공시 true, 회원이 존재하지 않아 실패시 false
     */
    public boolean delete(String id) {
        Member[] temp = new Member[SIZE];
        int idx = findIndexById(id);
        int max = existMemberNum();
        if(idx != -1) {
            for (int i = idx; i < max - 1; i++) {
                m[i] = m[i + 1];
            }
            m[max-1] = null;
            return true;
        }
        return false;
    }

    //회원정보 전체 삭제
    public void delete() {
        int max = existMemberNum();
        for (int i = 0; i < max; i++) {
            m[i] = null;
        }
    }

}
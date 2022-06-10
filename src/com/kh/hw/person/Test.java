package com.kh.hw.person;

import com.kh.hw.person.controller.PersonController;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        PersonController pc = new PersonController();

        System.out.println(Arrays.toString(pc.personCount()));
    }
}

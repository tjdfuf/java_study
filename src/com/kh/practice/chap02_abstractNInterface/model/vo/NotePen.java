package com.kh.practice.chap02_abstractNInterface.model.vo;

public interface NotePen {
    boolean PEN_BUTTON = true;

    static boolean bluetoothPen() {  // 블루투스펜 탑재여부
        return true;
    }
}

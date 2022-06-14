package day15.exception;

// 사용자 정의 예외 클래스
public class BalanceInsufficientException extends Exception{
    // 기본 구조
    // 기본 생성자
    public BalanceInsufficientException() {

    }
    // Exception 메세지를 받는 메서드
    public BalanceInsufficientException(String message) {
        super(message);
    }
}

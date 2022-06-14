package day15.exception;

public class Main {
    public static void main(String[] args) {

        try {
            int n = EasyScanner.intputIntger("정수: ");
            double m = EasyScanner.inputFloat("실수: ");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}

package day13.poly.basic;

class Moniter {}
class LGMoniter extends Moniter{}
class HPMoniter extends Moniter{}

public class Computer {

    // LGMoniter moniter;
    Moniter moniter;

    Computer () {
        this.moniter = new LGMoniter();
    }

    void changToHPMoniter () {
        this.moniter = new HPMoniter();
    }


}

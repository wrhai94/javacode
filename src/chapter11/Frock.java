package chapter11;

public class Frock {
    private static int currentNum = 100000;

    private int serialNumber;

    public Frock() {
        this.serialNumber = getNextNum();
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public static int getNextNum () {
        currentNum += 100;
        return currentNum;
    }
}

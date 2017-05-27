package homeTask.Calculator_25_05;

public class Quotient implements Calculation {
    int a, b;

    public Quotient(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int calculate() {
        return a % b;
    }
}

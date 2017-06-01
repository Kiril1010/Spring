package HomeTask.Calculator.Using_java;

public class MultiplicationJava implements CalculationJava {
    int a, b;

    public MultiplicationJava(int a, int b) {
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
        System.out.println(a * b);
        return a * b;
    }
}

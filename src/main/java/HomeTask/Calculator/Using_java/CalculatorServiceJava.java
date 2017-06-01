package HomeTask.Calculator.Using_java;

public class CalculatorServiceJava implements CalculationJava {
    private InjectionCollectionCalculatorJava injectionCollectionCalculatorJava;
    private AdditionJava additionJava;
    private SubtractionJava subtractionJava;
    private MultiplicationJava multiplicationJava;
    private DivisionJava divisionJava;
    private QuotientJava quotientJava;

    public CalculatorServiceJava() {}

    public InjectionCollectionCalculatorJava getInjectionCollectionCalculatorJava() {
        return injectionCollectionCalculatorJava;
    }

    public void setInjectionCollectionCalculatorJava(InjectionCollectionCalculatorJava collectionCalculator) {
        this.injectionCollectionCalculatorJava = collectionCalculator;
    }

    public void getAddition() {
        additionJava.calculate();
    }

    public void getSubtraction() {
        subtractionJava.calculate();
    }

    public void getMultiplication() {
        multiplicationJava.calculate();
    }

    public void getDivision() {
        divisionJava.calculate();
    }

    public void getQuotient() {
        quotientJava.calculate();
    }

    public void setAdditionJava(AdditionJava additionJava) {
        this.additionJava = additionJava;
    }

    public void setSubtractionJava(SubtractionJava subtractionJava) {
        this.subtractionJava = subtractionJava;
    }

    public void setMultiplicationJava(MultiplicationJava multiplicationJava) {
        this.multiplicationJava = multiplicationJava;
    }

    public void setDivisionJava(DivisionJava divisionJava) {
        this.divisionJava = divisionJava;
    }

    public void setQuotientJava(QuotientJava quotientJava) {
        this.quotientJava = quotientJava;
    }

    public void printList() {
        System.out.println(injectionCollectionCalculatorJava.getIntegerListKirill());
    }

    public void printMap() {
        System.out.println(injectionCollectionCalculatorJava.getIntegerMapKirill());
    }

    public int calculate() {
        return 0;
    }
}



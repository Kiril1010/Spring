package homeTask.Calculator_25_05.Calculator;

public class CalculatorService implements Calculation {
    private InjectionCollectionCalculator injectionCollectionCalculator;
    private Addition addition;
    private Subtraction subtraction;
    private Multiplication multiplication;
    private Division division;
    private Quotient quotient;

    public CalculatorService() {}

    public CalculatorService(InjectionCollectionCalculator injectionCollectionCalculator,
                             Addition addition, Subtraction subtraction, Multiplication multiplication,
                             Division division, Quotient quotient) {
        this.injectionCollectionCalculator = injectionCollectionCalculator;
        this.addition = addition;
        this.subtraction = subtraction;
        this.multiplication = multiplication;
        this.division = division;
        this.quotient = quotient;
    }

    public InjectionCollectionCalculator getInjectionCollectionCalculator() {
        return injectionCollectionCalculator;
    }

    public void setInjectionCollectionCalculator(InjectionCollectionCalculator collectionCalculator) {
        this.injectionCollectionCalculator = collectionCalculator;
    }

    public void getAddition() {
        addition.calculate();
    }

    public void getSubtraction() {
        subtraction.calculate();
    }

    public void getMultiplication() {
        multiplication.calculate();
    }

    public void getDivision() {
        division.calculate();
    }

    public void getQuotient() {
        quotient.calculate();
    }

    public void getListOfNumbers() {
        injectionCollectionCalculator.getIntegerListKirill();
    }

    public void setAddition(Addition addition) {
        this.addition = addition;
    }

    public void setSubtraction(Subtraction subtraction) {
        this.subtraction = subtraction;
    }

    public void setMultiplication(Multiplication multiplication) {
        this.multiplication = multiplication;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public void setQuotient(Quotient quotient) {
        this.quotient = quotient;
    }

    public void printList() {
        System.out.println(injectionCollectionCalculator.getIntegerListKirill());
    }

    public void printMap() {
        System.out.println(injectionCollectionCalculator.getIntegerMapKirill());
    }

    public int calculate() {
        return 0;
    }
}



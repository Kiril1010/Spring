package homeTask.Calculator_25_05.Calculator;

public class CalculatorService implements Calculation {
    private InjectionCollectionCalculator injectionCollectionCalculator;
    private Addition addition;

//    public CalculatorService(InjectionCollectionCalculator injectionCollectionCalculator, Addition addition) {
//        this.injectionCollectionCalculator = injectionCollectionCalculator;
//        this.addition = addition;
//    }
    public CalculatorService() {
    }

    public InjectionCollectionCalculator getInjectionCollectionCalculator() {
        return injectionCollectionCalculator;
    }

    public void setInjectionCollectionCalculator(InjectionCollectionCalculator collectionCalculator) {
        this.injectionCollectionCalculator = collectionCalculator;
    }

    public Addition getAddition() {
        return addition;
    }

    public void setAddition(Addition addition) {
        this.addition = addition;
    }

    public int calculate() {
        return 0;
    }

    public void printList() {
        System.out.println(injectionCollectionCalculator.getIntegerListKirill());
    }

    public void printMap() {
        System.out.println(injectionCollectionCalculator.getIntegerMapKirill());
    }
}

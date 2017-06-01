package HomeTask.Calculator.Using_java;

import java.util.ArrayList;
import java.util.Map;

public class InjectionCollectionCalculatorJava {
    private ArrayList<Integer> integerListKirill;
    private Map<String, Integer> integerMapKirill;

    public InjectionCollectionCalculatorJava() {
    }

    public ArrayList<Integer> getIntegerListKirill() {
        return integerListKirill;
    }

    public void setIntegerListKirill(ArrayList<Integer> integerListKirill) {
        this.integerListKirill = integerListKirill;
    }

    public Map<String, Integer> getIntegerMapKirill() {
        return integerMapKirill;
    }

    public void setIntegerMapKirill(Map<String, Integer> integerMapKirill) {
        this.integerMapKirill = integerMapKirill;
    }
}

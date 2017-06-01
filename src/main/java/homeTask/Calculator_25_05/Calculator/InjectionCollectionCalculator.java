package homeTask.Calculator_25_05.Calculator;

import java.util.ArrayList;
import java.util.Map;

public class InjectionCollectionCalculator {
    private ArrayList<Integer> integerListKirill;
    private Map<String, Integer> integerMapKirill;

    public InjectionCollectionCalculator() {
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

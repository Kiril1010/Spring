package via_xml;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class InjectionCollections {
    private List<Integer> integerList;
    private Set<Integer> integerSet;
    private Map<String, Integer> integerMap;


    public List<Integer> getIntegerList() {
        return integerList;
    }

    public void setIntegerList(List<Integer> integerList) {
        this.integerList = integerList;
    }

    public Set<Integer> getIntegerSet() {
        return integerSet;
    }

    public void setIntegerSet(Set<Integer> integerSet) {
        this.integerSet = integerSet;
    }

    public Map<String, Integer> getIntegerMap() {
        return integerMap;
    }

    public void setIntegerMap(Map<String, Integer> integerMap) {
        this.integerMap = integerMap;
    }
}

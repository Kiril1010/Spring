package homeTask.Calculator_25_05.Calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCalculator {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("kirill-context.xml");
        CalculatorService service = (CalculatorService) context.getBean("calculateService");
        service.getAddition();
        service.getSubtraction();
        service.getMultiplication();
        service.getDivision();
        service.getQuotient();
        service.getListOfNumbers();
    }
}

package HomeTask.Calculator.Using_java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCalculatorJava {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("kirill-context.xml");
        CalculatorServiceJava service = (CalculatorServiceJava) context.getBean("calculateService");
        service.getAddition();
        service.getSubtraction();
        service.getMultiplication();
        service.getDivision();
        service.getQuotient();
    }
}

package homeTask.Calculator_25_05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCalculator {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("kirill-context.xml");
        Addition addition = (Addition) context.getBean("addition");
        Subtraction subtraction = (Subtraction) context.getBean("subtraction") ;
        Multiplication multiplication = (Multiplication) context.getBean("multiplication") ;
        Division division = (Division) context.getBean("divison") ;
        addition.calculate();
        subtraction.calculate();
        multiplication.calculate();
        division.calculate();
    }
}

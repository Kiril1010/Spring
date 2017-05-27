package using_java.try_resource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class TestResource {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ManConfig.class);
//        context.refresh();
//        Man man = (Man) context.getBean("reallyMan");
        Man man = (Man) context.getBean(Man.class);
        man.printCity();
    }
}

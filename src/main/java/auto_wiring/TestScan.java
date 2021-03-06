package auto_wiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import using_java.CDPlayerJava;

public class TestScan {
    public static void main(String[] args)  {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(CDPlayerConfig.class);
        ctx.refresh();
        /*CDPlayer cdPlayer = ctx.getBean(CDPlayer.class);
        cdPlayer.turnOnMusic();*/
        SgtPeppersNew sgtPeppersNew = (SgtPeppersNew) ctx.getBean("sgtPeppersNew");
        sgtPeppersNew.play();
      /*  ApplicationContext context = new ClassPathXmlApplicationContext("annotation-context.xml");
        CDPlayer cdPlayer = context.getBean(CDPlayer.class);
        cdPlayer.turnOnMusic();*/
    }
}

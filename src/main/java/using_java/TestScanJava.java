package using_java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestScanJava {
    public static void main(String[] args)  {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(CDPlayerConfigJava.class);
        ctx.refresh();
        CDPlayerJava cdPlayer = ctx.getBean(CDPlayerJava.class);
//        CDPlayerJava10 cdPlayer = (CDPlayerJava10) ctx.getBean("MyPlayer");
        cdPlayer.turnOnMusic();
    }
}

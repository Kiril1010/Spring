package using_java.kirill;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestScanJava10 {
    public static void main(String[] args)  {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(CDPlayerConfigJava10.class);
        ctx.refresh();
//        CDPlayerJava10 cdPlayer = ctx.getBean(CDPlayerJava10.class);
        CDPlayerJava10 cdPlayer = (CDPlayerJava10) ctx.getBean("MyPlayer");
        cdPlayer.turnOnMusic();
    }
}

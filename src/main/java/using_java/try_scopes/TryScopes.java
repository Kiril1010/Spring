package using_java.try_scopes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import using_java.CDPlayerConfigJava;


/*Checking singleton scope for beans*/
public class TryScopes {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(CDPlayerConfigJava.class);
        ctx.refresh();
        SuperCDPlayerJava cdPlayer = ctx.getBean(SuperCDPlayerJava.class);
        cdPlayer.getPeppersJava().setArtist("Mashkov");
        NewerCDPlayerJava newerCDPlayerJava = ctx.getBean(NewerCDPlayerJava.class);
        System.out.println(newerCDPlayerJava.getPeppersJava().getArtist());
    }

}

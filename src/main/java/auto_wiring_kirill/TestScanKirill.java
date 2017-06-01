package auto_wiring_kirill;

import auto_wiring.CompactDisc;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestScanKirill {
    public static void main(String[] args)  {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(CDPlayerConfigKirill.class);
        context.refresh();

      /*  CDPlayerKirill cdPlayerKirill = context.getBean(CDPlayerKirill.class);
        cdPlayerKirill.turnOnMusic();*/

      SgtPeppersNewKirill peppersNewKirill = context.getBean(SgtPeppersNewKirill.class);
      peppersNewKirill.play();

    }
}

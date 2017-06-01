package auto_wiring_kirill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Component - This simple annotation identifies this class as a component class and
 serves as a clue to Spring that a bean should be created for the class. There’s no need
 to explicitly configure a SgtPeppersJava10 bean; Spring will do it for you because this class is
 annotated with @Component .
 */
    @Component
    public class SgtPeppers implements CompactDiscKirill {
        private String title = "Sgt. Pepper's Lonely Hearts Club Band";
        private String artist = "The Beatles";

        public void play() {
            System.out.println("Playing " + title + " by " + artist);
        }
    }

//@Component("SgtPeppersNewKirill")
@Component ("sgtPeppersNewKirill")
class SgtPeppersNewKirill implements CompactDiscKirill {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band - kirill";
    private String artist = "The Beatles - kirill";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}

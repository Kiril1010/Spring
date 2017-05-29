package auto_wiring;

import org.springframework.stereotype.Component;

/**
 * @Component - This simple annotation identifies this class as a component class and
 serves as a clue to Spring that a bean should be created for the class. There’s no need
 to explicitly configure a SgtPeppersJava bean; Spring will do it for you because this class is
 annotated with @Component .
 */
/*@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";


    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}*/

//@Component("SgtPeppersNew")
@Component
class SgtPeppersNew implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band - New";
    private String artist = "The Beatles - New";


    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}

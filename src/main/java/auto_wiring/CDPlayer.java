package auto_wiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {

    private CompactDisc compactDisc;

//    @Autowired
    public CDPlayer(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    @Autowired
    @Qualifier("sgtPeppersNew")
    public void setCompactDisc(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    public void turnOnMusic() {
        compactDisc.play();
//        System.out.println("Listening sound");
    }
}

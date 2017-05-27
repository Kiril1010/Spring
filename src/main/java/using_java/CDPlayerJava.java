package using_java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CDPlayerJava {

    private CompactDiscJava compactDiscJava;

    @Autowired
    public CDPlayerJava(@Qualifier("SgtPeppersJava")CompactDiscJava compactDisc) {
        this.compactDiscJava = compactDisc;
    }

   /* @Autowired
    public void setCompactDiscJava(@Qualifier("sgtPeppersJava") CompactDiscJava compactDiscJava) {
        this.compactDiscJava = compactDiscJava;
    }*/

    public void turnOnMusic() {
        compactDiscJava.play();
    }
}

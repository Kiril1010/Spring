package using_java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class CDPlayerJava {

    private CompactDiscJava compactDiscJava;

/*    @Autowired */
    public CDPlayerJava(@Qualifier(value = "SgtPeppersJava10")CompactDiscJava compactDisc) {
//    public CDPlayerJava10(CompactDiscJava10 compactDisc) {
        this.compactDiscJava = compactDisc;
    }

   /* @Autowired
    public void setCompactDiscJava(@Qualifier("sgtPeppersJava") CompactDiscJava10 compactDiscJava) {
        this.compactDiscJava = compactDiscJava;
    }*/

    public void turnOnMusic() {
        compactDiscJava.play();
    }
}

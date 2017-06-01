package auto_wiring_kirill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CDPlayerKirill {

    private CompactDiscKirill compactDiscKirill;

    public CDPlayerKirill(CompactDiscKirill compactDiscKirill) {
        this.compactDiscKirill = compactDiscKirill;
    }

    public CDPlayerKirill() {}

    @Autowired
    @Qualifier(value = "sgtPeppersNewKirill")
    public void setCompactDiscKirill(CompactDiscKirill compactDiscKirill) {
        this.compactDiscKirill = compactDiscKirill;
    }


    public void turnOnMusic() {
        compactDiscKirill.play();
        System.out.println("Listening sound");
    }
}

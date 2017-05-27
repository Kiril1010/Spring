package using_java.try_scopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import using_java.SgtPeppersJava;

@Component
public class NewerCDPlayerJava {

    private SingletonSgtPeppersJava peppersJava;

    @Autowired
    public NewerCDPlayerJava(SingletonSgtPeppersJava peppersJava) {
        this.peppersJava = peppersJava;
    }

    public SingletonSgtPeppersJava getPeppersJava() {
        return peppersJava;
    }

    public void setPeppersJava(SingletonSgtPeppersJava peppersJava) {
        this.peppersJava = peppersJava;
    }

    public void turnOnMusic() {
        peppersJava.play();
    }
}

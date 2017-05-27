package using_java.try_scopes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class SuperCDPlayerJava {

    private SingletonSgtPeppersJava peppersJava;

    public SuperCDPlayerJava(SingletonSgtPeppersJava peppersJava) {
        this.peppersJava = peppersJava;
    }

    public SingletonSgtPeppersJava getPeppersJava() {
        return peppersJava;
    }

    @Autowired
    public void setPeppersJava(SingletonSgtPeppersJava peppersJava) {
        this.peppersJava = peppersJava;
    }

    public void turnOnMusic() {
        peppersJava.play();
    }
}

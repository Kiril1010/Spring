package using_java.kirill;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "auto_wiring")
//@ComponentScan(basePackageClasses = CompactDiscJava10.class)
public class AnotherCDPlayerConfigJava10 {

    @Bean()
    public SgtPeppersJava10 sgtPeppers() {
        return new SgtPeppersJava10();
    }

}


package using_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "auto_wiring")
//@ComponentScan(basePackageClasses = CompactDiscJava10.class)
public class AnotherCDPlayerConfigJava {

    @Bean()
    public SgtPeppersJava sgtPeppers() {
        return new SgtPeppersJava();
    }

}


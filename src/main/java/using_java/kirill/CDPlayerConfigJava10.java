package using_java.kirill;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan

public class CDPlayerConfigJava10 {

    @Bean(name = "HotPeppers")
    public CompactDiscJava10 sgtPeppers() {
        return new SgtPeppersJava10();
    }

    @Bean(name = "MyPlayer")
    CDPlayerJava10 cdPlayerJava() {
        return new CDPlayerJava10(sgtPeppers());
    }
}


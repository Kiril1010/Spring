package using_java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import using_java.try_scopes.SuperCDPlayerJava;

@Configuration
@ComponentScan
//@Import(AnotherCDPlayerConfigJava10.class)
//@ComponentScan(basePackages = "auto_wiring")
//@ComponentScan(basePackageClasses = CompactDiscJava10.class)
public class CDPlayerConfigJava {
   /* @Autowired
    private AnotherCDPlayerConfigJava10 anotherConfig;*/

//    @Bean(name = "HotPeppers")
    /*@Bean(name = "HotPeppers")
    public CompactDiscJava10 sgtPeppers() {
        return new SgtPeppersJava10();
    }*/


   /* @Bean (name = "MyPlayer")
    CDPlayerJava10 cdPlayerJava() {
        return new CDPlayerJava10(sgtPeppers());
    }*/

   /* @Bean
    CDPlayerJava10 cdPlayerJava() {
        return new CDPlayerJava10(anotherConfig.sgtPeppers());
    }*/
/*also it works if CompactDiscJava10 annotated with Component*/
    /*@Bean
    CDPlayerJava10 cdPlayerJava(CompactDiscJava10 compactDiscJava) {
        return new CDPlayerJava10(compactDiscJava);
    }*/

}


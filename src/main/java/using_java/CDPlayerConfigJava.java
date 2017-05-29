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
//@Import(AnotherCDPlayerConfigJava.class)
//@ComponentScan(basePackages = "auto_wiring")
//@ComponentScan(basePackageClasses = CompactDiscJava.class)
public class CDPlayerConfigJava {
   /* @Autowired
    private AnotherCDPlayerConfigJava anotherConfig;*/

//    @Bean(name = "HotPeppers")
    /*@Bean(name = "HotPeppers")
    public CompactDiscJava sgtPeppers() {
        return new SgtPeppersJava();
    }*/


   /* @Bean (name = "MyPlayer")
    CDPlayerJava cdPlayerJava() {
        return new CDPlayerJava(sgtPeppers());
    }*/

   /* @Bean
    CDPlayerJava cdPlayerJava() {
        return new CDPlayerJava(anotherConfig.sgtPeppers());
    }*/
/*also it works if CompactDiscJava annotated with Component*/
    /*@Bean
    CDPlayerJava cdPlayerJava(CompactDiscJava compactDiscJava) {
        return new CDPlayerJava(compactDiscJava);
    }*/

}


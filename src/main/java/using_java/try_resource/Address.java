package using_java.try_resource;

import org.springframework.stereotype.Component;

/**
 * Standard @Resource annotation marks a resource that is needed by the application.
 * It is analogous to @Autowired in that both injects beans by type when no attribute provided.
 * But with name attribute, @Resource allows you to inject a bean by it’s name,
 * which @Autowired does not.
 */
@Component("address")
public class Address {
    public String city = "Dnepropetrovsk";
}

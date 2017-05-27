package using_java.try_resource;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Man {

    @Resource(name = "address")
    private Address anotherAddress;

    public void printCity() {
        System.out.println(anotherAddress.city);
    }
}

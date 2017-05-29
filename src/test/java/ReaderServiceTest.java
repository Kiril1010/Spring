import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import via_xml.ReaderService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application-context.xml")
public class ReaderServiceTest {

    @Autowired
    ReaderService service;

    @Test
    public void objectShouldNotBeNull() {
        Assert.assertNotNull(service.getFileReader());
    }
}

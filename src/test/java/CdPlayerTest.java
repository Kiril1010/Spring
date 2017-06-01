import auto_wiring.CDPlayerConfig;
import auto_wiring.CompactDisc;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CdPlayerTest {

//    @Autowired
//            @Qualifier("sgtPeppersNew")
    @Resource(name = "sgtPeppersNew")
    CompactDisc compactDisc;

    @Test
    public void objectShouldNotBeNull() {
        Assert.assertNotNull(compactDisc);
    }
}

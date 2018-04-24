package annotations.customAnnotation;


import com.worldapp.testng.annotations.WorldAppTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestWithCustomAnnotation {

    private static final Logger LOG = LoggerFactory.getLogger(TestWithCustomAnnotation.class);

    @WorldAppTest(description = "worldapp custom annotation", version = 1)
    public void testRunCustomAnnotion(){
        LOG.info("Annotation executed");
    }

}

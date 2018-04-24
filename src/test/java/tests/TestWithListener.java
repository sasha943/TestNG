package tests;


import listeners.WorldAppTestListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(value = WorldAppTestListener.class)
public class TestWithListener {

    private static final Logger LOG = LoggerFactory.getLogger(TestWithListener.class);

    @Test
    public void testSuccess() {
        LOG.info("testSuccess");
    }

    @Test
    public void testFailed() {
        throw new IllegalArgumentException();
    }

}

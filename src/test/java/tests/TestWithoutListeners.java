package tests;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class TestWithoutListeners {

    private static final Logger LOG = LoggerFactory.getLogger(TestWithoutListeners.class);
    
    private int counter = 0;
    private Method[] methods = getClass().getMethods();

    @Test(groups = "broken")
    public void test0(){
        LOG.info("no listener: {}", methods[counter++].getName());
    }

    @Test
    public void test1(){
        LOG.info("no listener: {}", methods[counter++].getName());
    }

    @Test(groups = "broken")
    public void test2(){
        LOG.info("no listener: {}", methods[counter++].getName());
    }

    @Test
    public void test3(){
        LOG.info("no listener: {}", methods[counter++].getName());
    }

    @Test
    public void test4(){
        LOG.info("no listener: {}", methods[counter++].getName());
    }

    @Test
    public void test5(){
        LOG.info("no listener: {}", methods[counter++].getName());
    }

    @Test
    public void test6(){
        LOG.info("no listener: {}", methods[counter++].getName());
    }

    @Test(groups = "broken")
    public void test7(){
        LOG.info("no listener: {}", methods[counter++].getName());
    }
}

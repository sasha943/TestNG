package annotations.customAnnotation;

import com.worldapp.testng.annotations.WorldAppTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestRunner {

    private static final Logger LOG = LoggerFactory.getLogger(TestRunner.class);

    public static void main(String[] args) {

        LOG.info("Testing...");

        int passed = 0, failed = 0, count = 0, ignore = 0;

        Class<TestWithCustomAnnotation> obj = TestWithCustomAnnotation.class;

        for (Method method : obj.getDeclaredMethods()) {

            if (method.isAnnotationPresent(WorldAppTest.class)) {

                Annotation annotation = method.getAnnotation(WorldAppTest.class);
                WorldAppTest test = (WorldAppTest) annotation;

                if (test.enabled()) {

                    try {
                        method.invoke(obj.newInstance());
                        LOG.warn("{} - Test {} - passed", ++count, method.getName());
                        passed++;
                    } catch (Throwable ex) {
                        LOG.error("{} - Test; - failed: {} {}", ++count, method.getName(), ex.getCause());
                        failed++;
                    }

                } else {
                    LOG.warn("{} Test; {} - ignored", ++count, method.getName());
                    ignore++;
                }

            }

        }

        LOG.info("Result : Total : {}, Passed: {}, Failed {}, Ignore {}", count, passed, failed, ignore);
    }
}

package annotations.customAnnotation;

import com.worldapp.testng.annotations.WorldAppTest;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestRunner {

    public static void main(String[] args) {

        System.out.println("Testing...");

        int passed = 0, failed = 0, count = 0, ignore = 0;

        Class<TestWithCustomAnnotation> obj = TestWithCustomAnnotation.class;

        for (Method method : obj.getDeclaredMethods()) {

            if (method.isAnnotationPresent(WorldAppTest.class)) {

                Annotation annotation = method.getAnnotation(WorldAppTest.class);
                WorldAppTest test = (WorldAppTest) annotation;

                if (test.enabled()) {

                    try {
                        method.invoke(obj.newInstance());
                        System.out.printf("%s - Test '%s' - passed %n", ++count, method.getName());
                        passed++;
                    } catch (Throwable ex) {
                        System.out.printf("%s - Test '%s' - failed: %s %n", ++count, method.getName(), ex.getCause());
                        failed++;
                    }

                } else {
                    System.out.printf("%s - Test '%s' - ignored%n", ++count, method.getName());
                    ignore++;
                }

            }

        }
        System.out.printf("%nResult : Total : %d, Passed: %d, Failed %d, Ignore %d%n", count, passed, failed, ignore);

    }
}

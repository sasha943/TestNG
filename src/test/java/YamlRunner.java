import org.testng.TestNG;
import org.testng.internal.YamlParser;
import org.testng.xml.XmlSuite;

import java.io.IOException;
import java.util.Collections;


public class YamlRunner {

    public static void main(String[] args) throws IOException {
        final TestNG testNG = new TestNG(true);
        final YamlParser parser = new YamlParser();
        final XmlSuite suites = parser.parse("src/test/resources/testRunner/yaml/WorldAppTestRunner.yaml", null, false);
        testNG.setXmlSuites(Collections.singletonList(suites));
        testNG.run();
    }
}

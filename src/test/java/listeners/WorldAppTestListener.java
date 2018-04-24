package listeners;

import com.codeborne.selenide.Selenide;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.*;
import org.testng.xml.XmlSuite;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;


public class WorldAppTestListener implements ITestListener, IReporter {

    private static final Logger LOG = LoggerFactory.getLogger(WorldAppTestListener.class);
    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    @Override
    public void onTestStart(ITestResult result) {
        LOG.info("Test with name {} started on {}", result.getName(), dateFormat.format(new Date()));
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        LOG.info("Test with name {} passed", result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        String testName = result.getName();
        if (!result.isSuccess()) {
            LOG.info("test: {} failed {}", testName, dateFormat.format(new Date()));
            LOG.info("make screenshots for test: {}", testName);
            Selenide.screenshot(new File("/src/test/resources/screenshots").getAbsolutePath());
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }

    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
        StringBuilder stringBuilder = new StringBuilder();
        for (ISuite suite : suites) {
            Map<String, ISuiteResult> results = suite.getResults();
            for (Map.Entry<String, ISuiteResult> result : results.entrySet()) {
                String report = buildReport(result.getValue().getTestContext());
                stringBuilder.append(report);
            }
        }
        try {
            FileUtils.writeStringToFile(new File("/src/test/resources/results/report" + System.currentTimeMillis()),
                                                            stringBuilder.toString(), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String buildReport(ITestContext context){
        return context.getName();
    }
}

package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
    static ExtentReports extent;

    public static ExtentReports getReport() {

        ExtentSparkReporter reporter =
                new ExtentSparkReporter("target/ExtentReport.html");

        reporter.config().setReportName("Automation Test Report");
        reporter.config().setDocumentTitle("QA Automation Results");

        extent = new ExtentReports();
        extent.attachReporter(reporter);

        return extent;
    }
}

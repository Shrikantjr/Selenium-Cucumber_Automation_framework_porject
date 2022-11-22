package cucumberRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber-parallel/output.json",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        "rerun:target/failed_scenarios.txt"},
        monochrome = true,
        features = "src/test/java/features/homepage.feature",
        glue = {"steps"}
        //tags = "@RegTest"
)

public class TestNgTestRunner extends AbstractTestNGCucumberTests {


    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        //System.setProperty("browser.type","chrome");
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\HD273UW\\Downloads\\chromedriver_win32\\chromedriver.exe");
        return super.scenarios();
    }
}

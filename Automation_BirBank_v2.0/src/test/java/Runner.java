import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue = {"Steps"},
        tags = "@test3",
        //tags = "@test or @test1 or @test2 or @test3",
        plugin = {"pretty","html:target/cucumber-reports/report.html"},
        monochrome = true
)
public class Runner {
    @AfterClass
    public static void writeExtentReport(){
        System.out.println("The test execution is completed, and the extent report has been generated successfully.");
    }
}

package runners;

import io.cucumber.junit.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber",
                "json:target/cucumber.json",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
        },
        features = "src/test/resources/features",
        glue = "step_definitions",
        tags = ""
)
public class CukesRunner {
}



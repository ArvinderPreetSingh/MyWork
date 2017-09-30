import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"E:/com.cucumbermavenparallel.project/src/test/resources/features/firefox.feature"},
        plugin = {"json:E:/com.cucumbermavenparallel.project/target/cucumber-parallel/2.json", "html:E:/com.cucumbermavenparallel.project/target/cucumber-parallel/2"},
        monochrome = false,
        tags = {"~@ignore"},
        glue = {"stepdef"})
public class Parallel02IT {
}

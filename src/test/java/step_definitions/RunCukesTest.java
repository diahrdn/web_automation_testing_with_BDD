package step_definitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = {"@CheckOut"}, //untuk menjalankan BDD dengan adanya tags
        features = {"classpath:features/"}, //packaging untuk class BDD
        glue = { "classpath:step_definitions"}, //penyimpanan di method akhir
        plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"} //untuk report cucumber
)

public class RunCukesTest {
}

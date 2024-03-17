package android;

import com.intuit.karate.Results;
import com.intuit.karate.junit5.Karate;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


/**
 * @author babusekaran
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features"},
        glue={"com.steps.definitions"},
        plugin = {"pretty", "html:target/cucumber-html-report"},
        tags = "@android",
//      dryRun = true,
        monochrome = true
)
public class AndroidTest {

    @Karate.Test
    public Karate test() {

        /*Results results = Karate.run("src/test/java/features").parallel(4);
        assertEquals(results.getErrorMessages(), 0, results.getFailCount());*/
        return Karate.run("src/test/java/features");
    }

}
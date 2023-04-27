package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"features"}    ,//path
        glue = {"steps"} ,//path to the steps
        plugin = {"pretty","html:target/html-report/cucumber.html"}
//        dryRun = false  //false(par defaut) : Execute tous les features
//       dryRun = true  //true : Execute seulement les features qui n ont pas de steps on le fait pour generer seulement les snippets et pas l executio
)
public class Test_runner {


}

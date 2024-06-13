package StepDefinitions;

import org.junit.runner.RunWith;    
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(
features="src/test/resources/Features",
glue={"StepDefinitions"},
monochrome = true,
//Reports
plugin = {"pretty", "html:target/HtmlReports", 
		  "json:target/JSONReports/report.json",
		  "junit:target/JUnitReports/xml.json"
		  },
tags="@smoketest or @paramstest"
)


public class TestRunner {

}

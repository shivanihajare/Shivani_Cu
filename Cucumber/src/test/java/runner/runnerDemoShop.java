package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="WebShopFeatures", glue="C:\\Users\\pdc3b-training.pdc3b\\eclipse\\shivanihajare\\Cucumber\\src\\test\\java\\stepDefinitions\\Demowebshop.java", tags= {"@Regression, @smoke"})

public class runnerDemoShop {
	
	

}
